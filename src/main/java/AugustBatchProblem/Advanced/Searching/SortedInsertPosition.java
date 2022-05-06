package AugustBatchProblem.Advanced.Searching;
/*
Problem Description

Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.

NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.



Problem Constraints

1 <= N <= 106


Input Format

First argument is an integer array A of size N.
Second argument is an integer B.


Output Format

Return an integer denoting the index of target value.


Example Input

Input 1:

A = [1, 3, 5, 6]
 B = 5

Input 2:

A = [1]
 B = 1



Example Output

Output 1:

2

Output 2:

0

 */
public class SortedInsertPosition {

    public static void main(String[] args) {
        int [] A = {1,3,5,6};
        int B = 5;
        System.out.println(solveSortedInsertPosition(A,B));
    }

    static int solveSortedInsertPosition(int[]A, int B){
        int n = A.length;
        int l = 0;
        int h = n-1;


        while (l<=h){
            int mid = (l + (h-l)/2);
            if(B == A[mid]) return mid;
            if(B < A[mid]) {
                h = mid-1;
            }
            else{
                l = mid+1;
            }

        }
        return h+1;
    }
}
