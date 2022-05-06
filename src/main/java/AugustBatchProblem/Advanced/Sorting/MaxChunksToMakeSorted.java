package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;

/*
Problem Description

Given an array of integers A of size N that is a permutation of [0, 1, 2, …, (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them, the result equals the sorted array.

What is the most number of chunks we could have made?



Problem Constraints

1 <= N <= 100000
0 <= A[i] < N


Input Format

The only argument given is the integer array A.


Output Format

Return the maximum number of chunks that we could have made.


Example Input

Input 1:

 A = [1, 2, 3, 4, 0]

Input 2:

 A = [2, 0, 1, 3]



Example Output

Output 1:

 1

Output 2:

 2
 */
public class MaxChunksToMakeSorted {

    public static void main(String[] args) {
        int [] A = {2, 0, 1, 3};
        System.out.println(solveMaxChunksToMakeSorted(A));

    }
    public  static int solveMaxChunksToMakeSorted(int[] arr) {
        int n = arr.length;
        Arrays.copyOfRange(arr, 0,1);
        int rmin[] = new int[arr.length+1];
        rmin[arr.length] = Integer.MAX_VALUE;

        for(int i = arr.length-1;i>=0;i--)
            rmin[i] = Math.min(arr[i],rmin[i+1]);

        int leftMax = Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            leftMax = Math.max(arr[i],leftMax);
            if(leftMax <= rmin[i+1])
                count++;
        }
        return count;
    }
}
