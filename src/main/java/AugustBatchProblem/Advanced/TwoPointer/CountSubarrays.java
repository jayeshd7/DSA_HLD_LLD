package AugustBatchProblem.Advanced.TwoPointer;
/*
Q4. Count Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.

Since the number of subarrays could be large, return value % 109 +7.



Problem Constraints

1 <= N <= 105

1 <= A[i] <= 106



Input Format

The only argument given is an Array A, having N integers.


Output Format

Return the number of subarrays of A, that have unique elements.


Example Input

Input 1:

 A = [1, 1, 3]

Input 2:

 A = [2, 1, 2]



Example Output

Output 1:

 4

Output 1:

 5



Example Explanation

Explanation 1:

 Subarrays of A that have unique elements only:
 [1], [1], [1, 3], [3]

Explanation 2:

 Subarrays of A that have unique elements only:
 [2], [1], [2, 1], [1, 2], [2]
 */
import java.util.HashMap;
import java.util.Map;

public class CountSubarrays {
    private static long mod = 1000000007;
    public static void main(String[] args) {
        int [] A = {1, 1, 3};
        solveCountSubArray(A);
    }

    private static int solveCountSubArray(int[] A) {
        int N = A.length;
        if (N == 1) {
            return 1;
        }
        long count = 0;
        int i = 0, j = 1;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(A[0], 0);
        while (j < N) {
            if (m.containsKey(A[j])) {
                long con = contribution(i, j-1);
                count = (con + count) % mod;
                i = m.get(A[j]) + 1;
                long tem = contribution(i, j-1);
                count = (count - tem + mod) % mod;
                m = new HashMap<>();
                int k = i;
                while (k < j) {
                    m.put(A[k], k);
                    k++;
                }
            }
            if (j == N - 1) {
                long con = contribution(i, j);
                count = (con + count) % mod;
                break;
            }
            m.put(A[j], j);
            j++;
        }
        return (int) count;
    }

    private static long contribution(int i, int j) {
        long len = getLength(i, j);
        long con = ((len * (len+1))/2) % mod;
        return con;
    }

    private static long getLength(int i, int j) {
        return (long) (j - i + 1);
    }
}

