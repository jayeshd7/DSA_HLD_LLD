package AugustBatchProblem.zeta.Gson.read;

import AugustBatchProblem.zeta.Gson.Staff;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadJson {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try {
            Reader reader = new FileReader("src/main/java/AugustBatchProblem/zeta/Gson/staff.json");
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
