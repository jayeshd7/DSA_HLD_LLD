package AugustBatchProblem.Advanced.Recursion;
/*
Problem Description

Given a set of distinct integers, A, return all possible subsets.

NOTE:

    Elements in a subset must be in non-descending order.
    The solution set must not contain duplicate subsets.
    Also, the subsets should be sorted in ascending ( lexicographic ) order.
    The list is not necessarily sorted.



Problem Constraints

1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format

First and only argument of input contains a single integer array A.


Output Format

Return a vector of vectors denoting the answer.


Example Input

Input 1:

A = [1]

Input 2:

A = [1, 2, 3]



Example Output

Output 1:

[
    []
    [1]
]

Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]

 */
import java.util.ArrayList;
import java.util.Collections;

public class Subset {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(12);A.add(13);
        System.out.println(subsetsSolve(A));

    }
    public static ArrayList<ArrayList<Integer>> subsetsSolve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        Collections.sort(A);
        Backtrack(A, 0, res, curr);

        return res;
    }

    static void Backtrack(ArrayList<Integer> A, int start, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> curr){
        list.add(new ArrayList<>(curr));

        for(int i=start; i<A.size(); i++){
            curr.add(A.get(i));
            Backtrack(A, i+1, list, curr);
            curr.remove(curr.size()-1);
        }
    }

}
// [[], [12],[12,13] ,[13]] - expected
// [[], [12],[13],[12,13] ]  - actual