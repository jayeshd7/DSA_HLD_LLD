package AugustBatchProblem.Advanced.BitManipulation;

import java.util.ArrayList;
/*
Problem Description

We define f(X, Y) as number of different corresponding bits in binary representation of X and Y.
For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2.

You are given an array of N positive integers, A1, A2 ,..., AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.



Problem Constraints

1 <= N <= 105

1 <= A[i] <= 231 - 1



Input Format

First and only argument of input contains a single integer array A.


Output Format

Return a single integer denoting the sum.


Example Input

Input 1:

 A = [1, 3, 5]

Input 2:

 A = [2, 3]



Example Output

Ouptut 1:

 8

Output 2:

 2
 */
public class DifferentBitsSumPairwise {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(5);
        System.out.println(cntBits(A));
    }


    private static final long mod = 1000000007;

    public static int cntBits(ArrayList<Integer> A) {
        long ans = 0;
        long n = A.size();
        for (int i = 0; i < 31; ++i) {
            long cnt = 0;
            for (int j = 0; j < A.size(); ++j) {
                if ((((A.get(j)) >> i) & 1) == 1) {
                    cnt++;
                }
            }
            ////for hamming distance !=0, we select any number having
            ans = (ans % mod + ((cnt % mod) * ((n - cnt) % mod) * 2) % mod) % mod;
        }
        return (int) ans;
    }
}
