package FOX;

import java.util.HashMap;
import java.util.Map;

public class FrequencyWordCount {
    public static void main(String[] args) {
        String s = "Hello Words";
        frequencyWordCount(s);
    }

    private static void frequencyWordCount(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s == null || s.length() == 0) {
            System.out.println("Empty String");
        }

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(map);
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (minEntry == null || entry.getValue().compareTo(minEntry.getValue()) < 0) {
                minEntry = entry;
            }
        }
        System.out.println(minEntry.getKey() + " " + minEntry.getValue());
    }
}
