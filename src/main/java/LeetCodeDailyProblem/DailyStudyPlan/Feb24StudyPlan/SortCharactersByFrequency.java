package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

import java.util.HashMap;

public class SortCharactersByFrequency {

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sortFrequencyChar(s));
    }

    private static String sortFrequencyChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if(map.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).forEach(entry -> {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        });
        return sb.toString();
    }
}
