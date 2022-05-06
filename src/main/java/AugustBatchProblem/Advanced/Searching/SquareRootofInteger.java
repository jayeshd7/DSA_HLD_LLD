package AugustBatchProblem.Advanced.Searching;
/*
Problem Description

Given an integer A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY.

NOTE: Do not use sort function from standard library. Users are expected to solve this in O(log(A)) time.



Problem Constraints

0 <= A <= 1010


Input Format

The first and only argument given is the integer A.


Output Format

Return floor(sqrt(A))


Example Input

Input 1:

 11

Input 2:

 9



Example Output

Output 1:

 3

Output 2:

 3
 */
public class SquareRootofInteger {

    public static void main(String[] args) {

        System.out.println(squareRootSolve(24));
    }

    private static int squareRootSolve(int A) {

        if (A <= 1) return A;
        long s = 0, e = A, m = 0;
        while (s < e) {
            m = s+ (e-s) / 2;
            if (m*m == A) return (int)m;
            if (m*m < A) s = m+1;
            else e = m-1;
        }
        if (s*s > A) return (int)s-1;
        return (int) s;
    }

}
