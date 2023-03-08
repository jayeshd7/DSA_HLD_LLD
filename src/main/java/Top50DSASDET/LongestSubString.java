package Top50DSASDET;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(solutionLongestSubString(s));
    }

    private static int solutionLongestSubString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);

            if (map.containsKey(currChar)) {
                start = Math.max(map.get(currChar) + 1, start);
            }
           if(output.length()<end-start+1){
                output = s.substring(start,end+1);
            }
            map.put(currChar, end);
        }
        return output.length();
    }
}
