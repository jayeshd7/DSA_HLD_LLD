package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;
/*
Problem Description

Given an array of integers A, find and return the minimum value of | A [ i ] - A [ j ] | where i != j and |x| denotes the absolute value of x.



Problem Constraints

1 <= length of the array <= 100000

-109 <= A[i] <= 109



Input Format

The only argument given is the integer array A.


Output Format

Return the minimum value of | A[i] - A[j] |.


Example Input

Input 1:

 A = [1, 2, 3, 4, 5]

Input 2:

 A = [5, 17, 100, 11]



Example Output

Output 1:

 1

Output 2:

 6
 */
public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int [] A = {1,2,3};
        System.out.println(minimumAbsoluteDifferenceSolution(A));
    }

    private static int minimumAbsoluteDifferenceSolution(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int diff = Integer.MAX_VALUE;

        for(int i =0; i<n-1;i++){
            if(a[i+1]-a[i] <diff){
                diff = a[i+1]-a[i];
            }
        }
        return diff;
    }
}
