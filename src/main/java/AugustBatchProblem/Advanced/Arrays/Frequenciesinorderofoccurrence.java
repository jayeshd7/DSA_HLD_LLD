package AugustBatchProblem.Advanced.Arrays;

import java.util.HashMap;

public class Frequenciesinorderofoccurrence {
      public  static void main(String[] args) {
        System.out.println(solveFrequency("AAABBBCCC"));
    }

     public static String solveFrequency(String A) {
        String ans = "";

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<A.length();i++){
            if(map.containsKey(A.charAt(i))){
                map.put(A.charAt(i),map.get(A.charAt(i))+1 );
            }
            else{
                map.put(A.charAt(i), 1);
            }
        }
        for(int j = 0;j<A.length();j++){
            if(map.get(A.charAt(j)) != 0){
                ans = ans + map.get(A.charAt(j));
                ans = ans + A.charAt(j);

                map.put(A.charAt(j), 0);

            }
        }
        return ans;
    }
}
