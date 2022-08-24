package AugustBatchProblem.StringProblems;

import java.util.HashSet;

public class IsUnqiueCharacter {

    public static void main(String[] args) {
        String str = "applle";
        HashSet<Character> hs = new HashSet<Character>();

        int n = str.length();

        for(int i = 0; i<n;i++){
            if(hs.contains(str.charAt(i))){
                System.out.println("find duplicate character" + ": " + str.charAt(i));
            }else {
                hs.add(str.charAt(i));
            }
        }
        if(hs.size() == n){
            System.out.println("no duplicate");
        }else{
            System.out.println("find duplicate");
        }
    }
}
