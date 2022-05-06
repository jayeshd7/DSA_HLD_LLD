package AugustBatchProblem.StringProblems;

import java.util.Arrays;

public class ChangeCharacter {

    public static void main(String[] args) {
        String A = "abcabbccd";
        int B = 3;
       int ans =  solve(A,B);
        System.out.println(ans);
        /*
        A = "abcabbccd"
        B = 3

        We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
        So the minimum number of distinct character will be 2.*/


        // b & C length = 3
        // a & d = 1 , replace any one character B or C
    }

    private static int solve(String s, int B) {


        int [] freq = new int[26];

        int uc = 0;

        for(int i =0 ;i<s.length();i++){
            if(freq[s.charAt(i)-'a']== 0){
                uc++;
            }
            freq[s.charAt(i)-'a'] +=1;
        }
        Arrays.sort(freq);// 1,2 , 3,3

        for(int i = 0;i<26;i++){
            if(freq[i] == 0) continue;
            if(B < freq[i]) break;
            B = B- freq[i] ;
            uc--;

        }






        return uc;
    }
}
