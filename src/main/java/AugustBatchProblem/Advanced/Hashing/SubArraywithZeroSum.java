package AugustBatchProblem.Advanced.Hashing;

import java.util.HashSet;
import java.util.Set;

/*
Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1 else return 0.



Problem Constraints

1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.


Output Format

Return whether the given array contains a subarray with a sum equal to 0.


Example Input

Input 1:

 A = [1, 2, 3, 4, 5]

Input 2:

 A = [-1, 1]



Example Output

Output 1:

 0

Output 2:

 1



Example Explanation

Explanation 1:

 No subarray has sum 0.

Explanation 2:

 The array has sum 0.

 */
public class SubArraywithZeroSum {

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        solveSubArraywithZeroSum(A);
    }

    private static int solveSubArraywithZeroSum(int [] arr) {

        int n = arr.length;

        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i <n; i++)
        {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return 0;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return -1;
    }
}
