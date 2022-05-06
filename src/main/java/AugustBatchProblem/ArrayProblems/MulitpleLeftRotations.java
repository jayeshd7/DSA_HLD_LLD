package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class MulitpleLeftRotations {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);

        solve(A,B);

    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> leftShiftedArr = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<B.size(); i++) {
            int index=B.get(i)%A.size();

            for(int k=0; k<A.size();k++) {
                leftShiftedArr.add(A.get(index));
                index= (index+1)%A.size();

                if(leftShiftedArr.size() == A.size()){
                    result.add(leftShiftedArr);
                    leftShiftedArr = new ArrayList<Integer>();
                }
            }

        }
        System.out.println(result);
        return result;


    }
}
