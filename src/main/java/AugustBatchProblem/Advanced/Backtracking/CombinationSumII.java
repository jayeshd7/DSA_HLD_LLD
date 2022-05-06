package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSumII {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(2);A.add(1);A.add(3);
        Collections.sort(A);
        int B = 3;
        System.out.println(combinationSumSolve(A, B));
    }

    private static ArrayList<ArrayList<Integer>> combinationSumSolve(ArrayList<Integer>A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombinations(ans,A,new ArrayList<Integer>(),0,B);


        return ans;
    }

    private static void findCombinations(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> A, ArrayList<Integer> temp, int index, int sum) {
    if(sum<0) return;

    if(index == A.size()){
        if(sum == 0)      ans.add(temp);
        return;
    }
        ArrayList<Integer> op1 = new ArrayList<Integer>(temp);
        op1.add(A.get(index));
        findCombinations(ans, A, op1, index + 1, sum - A.get(index));

        if(!(temp.size() != 0 && A.get(index) == temp.get(temp.size() - 1))){

            ArrayList<Integer> op2 = new ArrayList<Integer>(temp);
            findCombinations(ans, A, op2, index + 1, sum);
        }
    }
}
