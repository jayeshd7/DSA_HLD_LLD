package AugustBatchProblem.Advanced.Searching;

import java.util.Arrays;
/*
Problem Description

You are given a 2-D matrix C of size A × B.
You need to build a new 1-D array of size A by taking one element from each row of the 2-D matrix in such a way that the cost of the newly build array is minimized.

Cost of an array is the minimum possible value of the absolute difference between any two adjacent elements of the array.

So if the newly built array is X, element picked from row 1 will become X[1], element picked from row 2 will become X[2], and so on.

Determine the minimum cost of the newly build array.



Problem Constraints

2 <= A <= 1000
2 <= B <= 1000
1 <= C[i][j] <= 106


Input Format

The first argument is an integer A denoting number of rows in the 2-D array.
The second argument is an integer B denoting number of columns in the 2-D array.
The third argument is a 2-D array C of size A x B.


Output Format

Return an integer denoting the minimum cost of the newly build array.


Example Input

Input 1:

 A = 2
 B = 2
 C = [ [8, 4]
      [6, 8] ]

Input 2:

 A = 3
 B = 2
 C = [ [7, 3]
       [2, 1]
       [4, 9] ]



Example Output

Output 1:

 0

Output 2:

 1



Example Explanation

Explanation 1:

 Newly build array : [8, 8]. The minimum cost will be 0 since the absolute difference will be 0(8-8).

Explanation 2:

 Newly build array : [3, 2, 4]. The minimum cost will be 1 since the minimum absolute difference will be 1(3 - 2).
 */
public class MinimumDifference {

    public static void main(String[] args) {
        int A = 2;
        int B = 2;
        int [] [] C = {{7,3},{2,1},{4,9}};
        System.out.println(solveMinimumDifference(A, B, C));

    }

    public static int solveMinimumDifference(int A, int B, int[][] C) {

        for(int[] a : C)
        {
            Arrays.sort(a);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<A-1; i++)
        {
            for(int j=0; j<B; j++)
            {
                int target = C[i][j];
                int high = B-1;
                int low = 0;
                int lowerbound = -1; int upperbound = -1;
                while(low <= high)
                {
                    int mid = (high+low)>>1;
                    if(C[i+1][mid] == target)
                    {
                        return 0;
                    }
                    if(C[i+1][mid] < target)
                    {
                        low = mid+1;
                        lowerbound = C[i+1][mid];
                    }
                    else
                    {
                        high = mid-1;
                        upperbound = C[i+1][mid];
                    }
                }

                if(lowerbound != -1 && upperbound != -1)
                    ans = Math.min(ans, Math.min(target-lowerbound, upperbound-target));
                else if(lowerbound != -1 && upperbound == -1 )
                    ans = Math.min(ans, target-lowerbound);
                else if( lowerbound == -1 && upperbound != -1 )
                    ans = Math.min(ans, upperbound-target);
            }
        }
        return ans;
    }
}
