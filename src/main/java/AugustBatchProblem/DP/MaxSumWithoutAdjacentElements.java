package AugustBatchProblem.DP;
/*
Problem Description

Given a 2 x N grid of integer, A, choose numbers such that the sum of the numbers is maximum and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.

Note: You can choose more than 2 numbers.



Problem Constraints

1 <= N <= 20000
1 <= A[i] <= 2000


Input Format

The first and the only argument of input contains a 2d matrix, A.


Output Format

Return an integer, representing the maximum possible sum.


Example Input

Input 1:

 A = [
        [1]
        [2]
     ]

Input 2:

 A = [
        [1, 2, 3, 4]
        [2, 3, 4, 5]
     ]



Example Output

Output 1:

 2

Output 2:

 8



Example Explanation

Explanation 1:

 We will choose 2.

Explanation 2:

 We will choose 3 and 5.
 */
import java.util.Arrays;

public class MaxSumWithoutAdjacentElements {

    public static void main(String[] args) {
        int [] [] A = {
                {1, 2, 3, 4},
                {2, 3, 4, 5}
     };
        System.out.println(adjacent(A));
    }

    private static int adjacent(int [][] A) {
        if(A[0].length==1){
            return Math.max(A[0][0],A[1][0]);
        }
        int [] maxEle=new int[A[0].length];

        //getting list of all max ele
        for(int i=0;i<A[0].length;i++){
            maxEle[i]=Math.max(A[0][i],A[1][i]);

        }

        int [] ans=new int[maxEle.length];
        ans[0]=maxEle[0];
        ans[1]=Math.max(maxEle[0],maxEle[1]);
        for(int i=2;i<maxEle.length;i++){
            ans[i]=Math.max(maxEle[i]+ans[i-2], ans[i-1]);
            //System.out.print(ans[i]+" ");
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
    }
}
