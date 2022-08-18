package AugustBatchProblem.zeta.Gson;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Since;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Getter @Setter
public class Staff {
    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", positions=" + Arrays.toString(positions) +
                ", age=" + age +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }
    @SerializedName("first_name")
    private String  name;
    private String [] positions;

    @Since(1.0)
    private int age;
    @Since(2.0)
    private List<String> skills;

    @Since(3.0)
    private Map<String, BigDecimal> salary;


}
