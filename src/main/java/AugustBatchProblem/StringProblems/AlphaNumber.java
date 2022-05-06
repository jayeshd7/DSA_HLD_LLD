package AugustBatchProblem.StringProblems;

import java.util.ArrayList;

public class AlphaNumber {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        al.add(0,'s');
        al.add(1,'C');
        al.add(2,'2');
        al.add(3,'j');
        solve(al);
    }

    private static int solve(ArrayList<Character> A) {
        int [] number = {0,1,2,3,4,5,6,7,8,9};


        for(int i = 0;i<A.size();i++){
                if (!Character.isLetterOrDigit(A.get(i))) {
                    System.out.println("fail");
                    return 0;
                }
            }

        System.out.println("pass");
        return 1;
    }
}
