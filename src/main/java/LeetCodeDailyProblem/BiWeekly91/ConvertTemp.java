package LeetCodeDailyProblem.BiWeekly91;

import java.util.List;

public class ConvertTemp {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(convertTemp(celsius));
    }

    private static List<Double> convertTemp(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        return List.of(kelvin, fahrenheit);

    }
}
