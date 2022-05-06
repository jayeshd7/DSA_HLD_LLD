package AugustBatchProblem.Advanced.Searching;
/*
Problem Description

Given an integer A representing the number of square blocks. The height of each square block is 1. The task is to create a staircase of max height using these blocks.

The first stair would require only one block, the second stair would require two blocks and so on.

Find and return the maximum height of the staircase.



Problem Constraints

0 <= A <= 109


Input Format

The only argument given is integer A.


Output Format

Return the maximum height of the staircase using these blocks.


Example Input

Input 1:

 A = 10

Input 2:

 20



Example Output

Output 1:

 4

Output 2:

 5

 */
public class MaximumHeightOfStaircase {

    public static void main(String[] args) {
        int A = 10;
        System.out.println(solveMaximumHeightOfStaircase(20));
    }

    private static int solveMaximumHeightOfStaircase(int A) {

        if(A==0)return 0;

        long l = 1;
        long r = A;
        long curr = 1;
        while (l <=r){
            long mid = l + (r-l)/2;

            if(mid*(mid+1)/2 <=A){
                curr = mid;
                l = mid +1;

            }
            else {
                r = mid -1;
            }
        }
        return (int) curr;
    }

}
