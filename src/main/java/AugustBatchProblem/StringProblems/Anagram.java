package AugustBatchProblem.StringProblems;

import java.util.Arrays;

public class Anagram {
    static int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        Boolean ans = solve(s1, s2);
        System.out.println(ans);


    }

    private static boolean solve(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }

        char str1 [] = s1.toCharArray();
        char str2 [] = s2.toCharArray();
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;
        for (i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i])
               return false;
        }
        return true;
    }

}
