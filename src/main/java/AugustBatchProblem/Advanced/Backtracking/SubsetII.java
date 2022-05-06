package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
/*
Problem Description

Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.



Problem Constraints

0 <= N <= 16


Input Format

Only argument is an integer array A of size N.


Output Format

Return a 2-D vector denoting all the possible subsets.


Example Input

Input 1:

 A = [1, 2, 2]

Input 2:

 A = [1, 1]



Example Output

Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]

Output 2:

 [
    [],
    [1],
    [1, 1]
 ]



Example Explanation

Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.
 */
public class SubsetII {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(2);A.add(2);
        System.out.println(subsetII(A));
        
    }

    private static ArrayList<ArrayList<Integer>> subsetII(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        res.add(temp);
        createSubsets(res, temp, A, 0);

        return res;
    }

    private static void createSubsets(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> temp, ArrayList<Integer> A, int idx) {
        for(int i =idx;i<A.size();i++){

            if(i>idx && A.get(i) == A.get(i-1)){
                continue;
            }
            temp.add(A.get(i));
            res.add(new ArrayList<>(temp));
            createSubsets(res,temp,A,i+1);
            temp.remove(temp.size()-1);
        }

    }
}
