package AugustBatchProblem.Advanced.Searching;
/*
Rotated Sorted Array Search
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints

1 <= N <= 1000000

1 <= A[i] <= 10^9

all elements in A are disitinct.



Input Format

The first argument given is the integer array A.

The second argument given is the integer B.


Output Format

Return index of B in array A, otherwise return -1


Example Input

Input 1:

A = [4, 5, 6, 7, 0, 1, 2, 3]
B = 4

Input 2:

A = [1]
B = 1



Example Output

Output 1:

 0

Output 2:

 0

 */
public class RotatedSortedArraySearch {

    public static void main(String[] args) {
        int [] A = {4,5,6,0,1,2,3};
        System.out.println(search(A, 1));

    }
    public static int search(final int[] A, int key) {
        int N = A.length;
        int L = 0;
        int R = N - 1;

        while (L <= R) {

            int M = L + ((R - L) / 2);
            if (A[M] == key) return M;

            // the bottom half is sorted
            if (A[L] <= A[M]) {
                if (A[L] <= key && key < A[M])
                    R = M - 1;
                else
                    L = M + 1;
            }
            // the upper half is sorted
            else {
                if (A[M] < key && key <= A[R])
                    L = M + 1;
                else
                    R = M - 1;
            }
        }
        return -1;
    }
}
