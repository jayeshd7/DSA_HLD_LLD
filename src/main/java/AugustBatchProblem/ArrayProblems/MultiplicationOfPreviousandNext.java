package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class MultiplicationOfPreviousandNext {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);

        solve(al);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> al1 = new ArrayList<>();
        if(A.size() == 1){
            al1.add(A.get(A.size()-1));
        }
        if(A.size() >1) {
            al1.add(A.get(0) * A.get(1));
            al1.add(A.get(0) * A.get(2));
            for (int i = 1; i <= A.size() - 3; i++) {
                al1.add(A.get(i) * A.get(i + 2));
            }

            al1.add(A.get(A.size() - 1) * A.get(A.size() - 2));
        }
        System.out.println(al1);
        return al1;



    }

}
