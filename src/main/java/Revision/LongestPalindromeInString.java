package Revision;

import java.util.ArrayList;

public class LongestPalindromeInString {

    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(longestPalindromeInStringSolution(s));
    }

    private static String longestPalindromeInStringSolution(String S) {

        if(S.length() < 2){
            return S;
        }
        String max="";
        for(int i=0; i<S.length()-1; i++){
            String odd = findPalindrome(S, i, i);  //odd length plaindrome
            String even = findPalindrome(S, i, i+1);  //even length plaindrome
            if (odd.length() > max.length()) {
                max = odd;
            }
            if (even.length() > max.length()) {
                max = even;
            }
        }
        return max;
    }

    private static String findPalindrome(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--; right++;
        }
        return s.substring(left+1, right);
    }






}
