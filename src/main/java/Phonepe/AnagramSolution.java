package Phonepe;

import java.util.ArrayList;
import java.util.HashMap;

public class AnagramSolution {
    public static void main(String[] args) {


        String []s = {"cat", "tac"};

        anagramSolution(s);
    }

    private static void anagramSolution(String[] s) {

        HashMap<String, Integer>hm = new HashMap<>();
        for(int i =0; i<s.length;i++){
            String s1 = s[i];
            for(int j = 1;j<s.length;j++){
                String s2 = s[j];
            if(hm.containsKey(String.valueOf(s2.charAt(j)))){
                int value = hm.get(String.valueOf(s2.charAt(j)));
                hm.put(String.valueOf(s2.charAt(j)), value-1);
            }else {
                hm.put(String.valueOf(s1.charAt(i)), 1);
            }

        }
        }
        if(hm.size() == 0){
            System.out.println("anagram..");
        }
    }
}
