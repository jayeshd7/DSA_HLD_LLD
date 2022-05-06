package AugustBatchProblem.Advanced.Searching;
/*
Problem Description

Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.


Output Format

Return the single element that appears only once.


Example Input

Input 1:

A = [1, 1, 7]

Input 2:

A = [2, 3, 3]



Example Output

Output 1:

 7

Output 2:

 2

 */
public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int [] A = {1,1,2,3,3};
        System.out.println(solveSingelElementInSortedArray(A));
    }

    private static int solveSingelElementInSortedArray(int[] A) {

        int n = A.length;
        int l =0;
        int r = n-1;
        int mid;

        if(n == 1) return A[0];
        if (A[l] != A[l+1]) return A[l];
        if(A[r] !=A[r-1]) return A[r];


        while (l<=r){
             mid = l +(r-l)/2;
             if(A[mid] != A[mid-1] || A[mid] != A[mid+1]){
                 return A[mid];
             }
             else if((A[mid] == A[mid-1] && A[mid]  %2 !=0) || (A[mid] == A[mid+1] && A[mid] %2 == 0)){
                 l = mid+1;
             }
             else r = mid-1;

        }
        return -1;
    }

}
