package sdeSheet;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = longestSubstring(s);
        System.out.println("Longest substring without repeat: " + ans);
    }

    private static int longestSubstring(String s) {

        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
