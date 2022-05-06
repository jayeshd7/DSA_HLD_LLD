package AugustBatchProblem.DP;
/*
Given an integer array A of size N. Find the contiguous subarray within the given array (containing at least one number) which has the largest product.

Return an integer corresponding to the maximum product possible.

NOTE: Answer will fit in 32-bit integer value.



Problem Constraints

1 <= N <= 5 * 105

-100 <= A[i] <= 100



Input Format

First and only argument is an integer array A.


Output Format

Return an integer corresponding to the maximum product possible.


Example Input

Input 1:

 A = [4, 2, -5, 1]

Input 2:

 A = [-3, 0, -5, 0]



Example Output

Output 1:

 8

Output 2:

 0



Example Explanation

Explanation 1:

 We can choose the subarray [4, 2] such that the maximum product is 8.

Explanation 2:

 0 will be the maximum product possible.
 */
public class MaxProductSubarray {
    public int maxProduct(final int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2];

        /* Initialize the base case scenario for dp */
        int result = nums[0];
        dp[0][0] = result;
        dp[0][1] = result;

        for(int i = 1; i < n; i++){
            if(nums[i] >= 0){
                /* If the current number is greater than zero, we will get the maximum by multiplying with the last max value */
                dp[i][0] = Math.max(dp[i-1][0] * nums[i], nums[i]);
                dp[i][1] = Math.min(dp[i-1][1] * nums[i], nums[i]);
            } else {
				/*
				If the current number is negative,
				we will get the maximum value by multiplying with the last min value
				Hence, max is checked with dp[i-1][1], i.e, the last min value.
				*/
                dp[i][0] = Math.max(dp[i-1][1] * nums[i], nums[i]);
                dp[i][1] = Math.min(dp[i-1][0] * nums[i], nums[i]);
            }

            result = Math.max(result, dp[i][0]);
        }

        return result;
    }
}
