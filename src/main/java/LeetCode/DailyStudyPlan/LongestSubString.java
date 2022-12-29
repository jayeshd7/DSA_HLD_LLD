package LeetCode.DailyStudyPlan;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    private static String lengthOfLongestSubstring(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (map.containsKey(currChar)) {
                start = Math.max(map.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            map.put(currChar, end);
        }
        return output;
    }

}
