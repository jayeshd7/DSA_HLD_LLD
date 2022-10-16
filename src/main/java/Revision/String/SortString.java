package Revision.String;

import java.util.Arrays;

public class SortString {
    static int MAX_CHAR = 26;
    public static void main(String[] args) {
        String s = "jayesh";
        sortStringSolve1(s);
        sortStringSolve2(s);
    }

    private static void sortStringSolve2(String s) {
        char ch [] = s.toCharArray();
        Arrays.sort(ch);
        reverseString(ch);
        System.out.println(String.valueOf(ch));
        
    }

    private static void reverseString(char[] ch) {
        int i, n = ch.length;
        char t;
        for (i = 0; i < n / 2; i++)
        {
            t = ch[i];
            ch[i] = ch[n - i - 1];
            ch[n - i - 1] = t;
        }
    }

    private static void sortStringSolve1(String s) {
        int charCount[] = new int[MAX_CHAR];

        for(int i =0; i<s.length();i++){
            charCount[s.charAt(i) -'a']++;
        }
        for(int j = MAX_CHAR-1;j>=0;j--){
            for (int k = 0; k < charCount[j]; k++)
            {
                System.out.print((char) ('a' + j));
            }
        }

        }

}
