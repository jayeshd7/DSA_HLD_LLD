package AugustBatchProblem.StringProblems;

import java.util.ArrayList;


public class UpperCase {

    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();
        al.add(0,'s');
        al.add(1,'C');
        solve(al);
    }

    private static ArrayList<Character> solve(ArrayList<Character> A) {

        ArrayList<Character> x = new ArrayList<>();

        for(int i = 0;i<A.size();i++){
            x.add(i,Character.toLowerCase(A.get(i)));
        }
        System.out.println(x);
        return x;
    }
}
