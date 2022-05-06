package AugustBatchProblem.Advanced.TwoPointer;

import java.util.Arrays;
/*
Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".


Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5

Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110



Example Output

Output 1:

 [2, 3]

Output 2:

 -1



Example Explanation

Explanation 1:

 [2, 3] sums up to 5.

Explanation 2:

 No subarray sums up to required number.

 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int B = 5;
     int [] C =solveSubArrayWithGivenSum(A, B);
     for(int l =0; l<C.length;l++){
         System.out.println(C[l]);
     }
    }

    private static int[] solveSubArrayWithGivenSum(int [] A, int B) {

        int n = A.length;
        int[] ans = new int [n];
        int curr_sum = A[0], start = 0, i;

        for( i = 1; i<=n;i++){
            while (curr_sum>B && start <i-1){
                curr_sum = curr_sum - A[start];
                start++;
            }
            if(curr_sum == B) {
                for(int j = start; j<= i-1;j++){
                    ans[j] = A[j];
                }
                int [] expectedAns = Arrays.stream(ans).filter(num -> num !=0).toArray();
                return  expectedAns;
            }
            if(i<n){
                curr_sum= curr_sum+A[i];
            }
        }
        return new int[]{-1};
    }

}
