package AugustBatchProblem.Advanced.Backtracking;
/*
Problem Description

Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.



Problem Constraints

1 <= N <= 9


Input Format

Only argument is an integer array A of size N.


Output Format

Return a 2-D array denoting all possible permutation of the array.


Example Input

A = [1, 2, 3]



Example Output

[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]

 */
import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1); A.add(3); A.add(2);
        System.out.println(permute(A));
    }
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        permuteRecursive(list, new ArrayList<Integer>(), A);
        return list;
    }

    private static void permuteRecursive(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp, ArrayList<Integer> a) {
        if(temp.size() == a.size()){
            list.add(new ArrayList<>(temp));
            return;
        }
        // recursion
        for(int i = 0; i< a.size();i++){
            if(temp.contains(a.get(i))) continue;
            temp.add(a.get(i));
            permuteRecursive(list, temp,a);
            temp.remove(temp.size() -1);
        }

    }
}
