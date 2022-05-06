package AugustBatchProblem.Advanced.TwoPointer;
/*
Problem Description

Given a binary array A, find the maximum sequence of continuous 1's that can be formed by replacing at-most B zeroes.

For this problem, return the indices of maximum continuous series of 1s in order.

If there are multiple possible solutions, return the sequence which has the minimum start index.



Problem Constraints

0 <= B <= 105

1 <= size(A) <= 105

A[i]==0 or A[i]==1



Input Format

First argument is an binary array A.

Second argument is an integer B.



Output Format

Return an array of integers denoting the indices(0-based) of 1's in the maximum continuous series.


Example Input

Input 1:

 A = [1 1 0 1 1 0 0 1 1 1 ]
 B = 1

Input 2:

 A = [1, 0, 0, 0, 1, 0, 1]
 B = 2



Example Output

Output 1:

 [0, 1, 2, 3, 4]

Output 2:

 [3, 4, 5, 6]



Example Explanation

Explanation 1:

 Flipping 0 present at index 2 gives us the longest continous series of 1's i.e subarray [0:4].

Explanation 2:

 Flipping 0 present at index 3 and index 5 gives us the longest continous series of 1's i.e subarray [3:6].
 */
public class MaxContinuousSeriesof1s {

    public static void main(String[] args) {
        int [] A = {1, 1, 0, 1, 1, 0, 0, 1, 1, 1};
        int B = 1;
        System.out.println(solveMaxContinousSeriesOf1s(A, B));
    }

    private static int[] solveMaxContinousSeriesOf1s(int[] A, int B) {

        int count0 = 0;
        int i = 0;
        int window = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for(int j = 0 ; j< A.length ; j++){

            if(A[j] == 0){
                count0 ++;

            }
            //System.out.println(count0);
            while(count0>B){
                if(A[i] == 0){
                    count0--;
                }
                i++;
            }

            if(window< (j-i+1)){

                window = (j-i+1);
                start = i;
                end = j;
            }

        }
        int[] ans = new int[window];
        int idx = 0;
        for(int k = start ; k<= end; k++ ){

            ans[idx++] = k;
        }
        System.out.println(ans);
        return ans;

    }
}
