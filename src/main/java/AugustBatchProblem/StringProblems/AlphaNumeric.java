package AugustBatchProblem.StringProblems;

import java.util.ArrayList;

public class AlphaNumeric {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        al.add(0,'s');
        al.add(1,'C');
        al.add(2,'2');
        al.add(3,'j');
        solve(al);
    }

    private static int solve(ArrayList<Character> A) {



        for(int i = 0;i<A.size();i++){
           if(!Character.isAlphabetic(A.get(i))){
               System.out.println("fail");
                return 0;
           }

        }

        return 1;
    }
}
