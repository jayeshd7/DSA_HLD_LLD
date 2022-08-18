package AugustBatchProblem.zeta.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteJson {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                //.excludeFieldsWithoutExposeAnnotation() // custom @expose annotation in pojo
                .serializeNulls()  // if set is not there though it will print null values
                .setVersion(2.0) //less than or equal value only rint
                .setPrettyPrinting().create();
        Staff staff = createStaffObject();

        String json = gson.toJson(staff);
        System.out.println(json);

        try{

            FileOutputStream fileOut = new FileOutputStream("src/main/java/AugustBatchProblem/zeta/Gson/staff.json");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(json);
            objectOut.close();
           /* FileWriter writer = new FileWriter("src/main/java/AugustBatchProblem/zeta/writeJson/staff.json");
            gson.toJson(staff, writer);*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static Staff createStaffObject() {
        Staff staff = new Staff();

        staff.setName("jayesh");
        staff.setAge(32);
        staff.setPositions(new String[]{"Developer", "Tester"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(List.of("Java", "Python"));
        return staff;
    }
}
