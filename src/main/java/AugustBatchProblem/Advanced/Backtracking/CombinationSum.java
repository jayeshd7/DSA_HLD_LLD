package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

/*
Problem Description

Given a set of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.



Problem Constraints

1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format

First argument is the vector A.

Second argument is the integer B.



Output Format

Return a vector of all combinations that sum up to B.


Example Input

Input 1:

A = [2, 3]
B = 2

Input 2:

A = [2, 3, 6, 7]
B = 7



Example Output

Output 1:

[ [2] ]

Output 2:

[ [2, 2, 3] , [7] ]

 */
public class CombinationSum {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(2);A.add(3);A.add(6);A.add(7);
        int B = 7;
        System.out.println(combinationSumSolve(A, B));
    }

    private static ArrayList<ArrayList<Integer>> combinationSumSolve(ArrayList<Integer>A , int B) {

        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        generateAllValues(ans, B, new ArrayList<Integer>(), 0, A);
        
        return ans;
    }

    private static void generateAllValues(ArrayList<ArrayList<Integer>> ans, int target, ArrayList<Integer> temp, int index, ArrayList<Integer> A) {
        if (index == A.size()) {

            if (target == 0) {
                ans.add(new ArrayList<>(temp));
            }

            return;
        }

        if( index > 0 && A.get(index).equals(A.get(index-1))){
            generateAllValues(ans, target, temp, index + 1, A);
            return;
        }


        if ( A.get(index) <= target  ) {

            //Do
            temp.add(A.get(index));
            // backtracking call
            generateAllValues(ans, target - A.get(index), temp, index, A);
            //undo
            temp.remove(temp.size() - 1);

        }

        generateAllValues(ans, target, temp, index + 1, A);
    }
}
