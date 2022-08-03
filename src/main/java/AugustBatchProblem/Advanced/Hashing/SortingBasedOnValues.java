package AugustBatchProblem.Advanced.Hashing;

import AugustBatchProblem.RandomProblems.listToMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingBasedOnValues {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("pinky", 97);
        hm.put("pooja", 100);
        hm.put("jayesh", 98);
        hm.put("bhavi", 99);


        List<Map.Entry<String, Integer>> collect = hm.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList());
        System.out.println(collect);
    }
}
