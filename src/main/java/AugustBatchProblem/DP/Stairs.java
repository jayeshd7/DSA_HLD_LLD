package AugustBatchProblem.DP;

import java.util.Arrays;


/*
You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Problem Constraints

1 <= A <= 36


Input Format

The first and the only argument contains an integer A, the number of steps.


Output Format

Return an integer, representing the number of ways to reach the top.


Example Input

Input 1:

 A = 2

Input 2:

 A = 3



Example Output

Output 1:

 2

Output 2:

 3



Example Explanation

Explanation 1:

 Distinct ways to reach top: [1, 1], [2].

Explanation 2:

 Distinct ways to reach top: [1 1 1], [1 2], [2 1].
 */
public class Stairs {
    public int climbStairs(int n) {

        int[] map = new int[n + 1];
        Arrays.fill(map, -1);
        return countWays(n, map);
    }

    public static int countWays(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo);
            return memo[n];
        }
    }
}
