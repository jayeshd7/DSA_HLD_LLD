package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(2);A.add(2);
        ArrayList<Integer>B = new ArrayList<>();
        B.add(2);B.add(2);B.add(3);
        System.out.println(intersect(A,B));
    }
    public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();

        int ai=0,bi=0;

        while(ai < A.size() && bi < B.size()){

            if(A.get(ai).equals(B.get(bi))){
                ans.add(A.get(ai));
                ai++;
                bi++;
            }

            else if(A.get(ai) < B.get(bi)){
                ai++;
            }

            else{
                bi++;
            }
        }

        return ans;

    }

}
