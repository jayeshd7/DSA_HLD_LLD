package AugustBatchProblem.Advanced.Arrays;
/*
Problem Description

Given a matrix of integers A of size N x M and multiple queries Q, for each query find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

    Rows are numbered from top to bottom and columns are numbered from left to right.
    Sum may be large so return the answer mod 109 + 7.



Problem Constraints

1 <= N, M <= 1000
-100000 <= A[i] <= 100000
1 <= Q <= 100000
1 <= B[i] <= D[i] <= N
1 <= C[i] <= E[i] <= M


Input Format

The first argument given is the integer matrix A.
The second argument given is the integer array B.
The third argument given is the integer array C.
The fourth argument given is the integer array D.
The fifth argument given is the integer array E.
(B[i], C[i]) represents the top left corner of the i'th query.
(D[i], E[i]) represents the bottom right corner of the i'th query.


Output Format

Return an integer array containing the submatrix sum for each query.


Example Input

Input 1:

 A = [   [1, 2, 3]
         [4, 5, 6]
         [7, 8, 9]   ]
 B = [1, 2]
 C = [1, 2]
 D = [2, 3]
 E = [2, 3]

Input 2:

 A = [   [5, 17, 100, 11]
         [0, 0,  2,   8]    ]
 B = [1, 1]
 C = [1, 4]
 D = [2, 2]
 E = [2, 4]



Example Output

Output 1:

 [12, 28]

Output 2:

 [22, 19]



Example Explanation

Explanation 1:

 For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.

 */
public class SubMatrixSumQueries {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int [] B = {1, 2};
        int [] C  = {1, 2};
        int [] D = {2, 3};
        int [] E = {2, 3};
        solveSubMatrixSumQueries(A, B,C,D,E);
    }
    private static final long mod = (long) (1e9+7);
    public static int[] solveSubMatrixSumQueries(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        long[][] T = new long[A.length][A[0].length];
        int rm = A.length;
        int cm = A[0].length;
        for(int i = 0; i < rm; i++) {
            for(int j = 0; j < cm; j++) {
                T[i][j] = A[i][j]+0L;
            }
        }

        for(int i = 0; i < rm; i++) {
            for(int j = 0; j < cm; j++) {
                long left = (j==0)?0:T[i][j-1];
                long top = (i==0)?0:T[i-1][j];
                long diagonal = (i>0 && j>0)?T[i-1][j-1]:0;
                long tmp = T[i][j] - diagonal + left + top;
                while(tmp < 0) {
                    tmp = tmp + mod;
                }
                T[i][j] = tmp%mod;
                // System.out.print(A[i][j] + " ");
            }
            // System.out.println();
        }

        int[] op = new int[B.length];
        for(int i = 0 ; i < B.length ; i++) {
            int b = B[i]-1;
            int c = C[i]-1;
            int d = D[i]-1;
            int e = E[i]-1;

            int bl = (c>0)?(int)T[d][c-1]:0;
            int tr = (b>0)?(int)T[b-1][e]:0;
            int diagonal = (b>0 && c>0)?(int)T[b-1][c-1]:0;
            long tmp = (0L + T[d][e] - bl - tr + diagonal);
            while(tmp < 0) {
                tmp += mod;
            }
            tmp = tmp%mod;
            op[i] = (int)tmp;
        }


        return op;
    }
}
