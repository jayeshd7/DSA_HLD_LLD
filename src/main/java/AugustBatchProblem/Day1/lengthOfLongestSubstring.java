package AugustBatchProblem.Day1;

import java.util.HashSet;

public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();
        int l = 0; int max = 0;

        for(int r = 0; r<s.length();r++){
            while(set.contains(s.charAt(r)) && l<=r){
                set.remove(s.charAt(r));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, set.size());
        }
    }
}
