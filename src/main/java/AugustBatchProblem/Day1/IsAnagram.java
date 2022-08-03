package AugustBatchProblem.Day1;

import java.util.HashMap;

public class IsAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if(s.length() != t.length()){
            System.out.println("not anagram");
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char c:t.toCharArray()){

            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
            }

        }
        if(map.isEmpty()){
            System.out.println("Anagram");
        }
    }
}
