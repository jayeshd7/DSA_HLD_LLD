package AugustBatchProblem.Day1;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        if(t.length() > s.length())
            System.out.println("");
        String out = "";
        int totalCount = 0;
        int matchCount = 0;

        Map<Character,Integer> map_t = new HashMap<>();
        for(char c : t.toCharArray()) {
            totalCount++;
            map_t.put(c, map_t.getOrDefault(c,0)+1);
        }

        Map<Character,Integer> map_s = new HashMap<>();
        int start = 0;
        for(int end=0; end<s.length(); end++) {
            char c = s.charAt(end);
            map_s.put(c, map_s.getOrDefault(c,0)+1);

            if(map_t.containsKey(c) && map_t.get(c) >= map_s.get(c)) {
                matchCount++;
            }

            while(matchCount == totalCount) {
                if(out.equals("") || out.length() > end-start+1) {
                    out = s.substring(start,end+1);
                }
                char x = s.charAt(start);
                start++;
                map_s.put(x, map_s.get(x)-1);
                if(map_t.containsKey(x) && map_t.get(x) > map_s.get(x)) {
                    matchCount--;
                }
            }
        }
        System.out.println(out);
    }
}
