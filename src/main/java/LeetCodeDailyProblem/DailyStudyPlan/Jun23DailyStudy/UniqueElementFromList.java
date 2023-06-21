package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElementFromList {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,4,5,7,3,9,3);

        List<Integer> unique = list.stream().filter(value -> Collections.frequency(list, value) == 1).collect(Collectors.toList());
        System.out.println(unique);
    }
}
