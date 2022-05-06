package AugustBatchProblem.Advanced.Searching;
/*
 Matrix Search
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integar B in matrix A.

This matrix A has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than or equal to the last integer of the previous row.

Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints

1 <= N, M <= 1000
1 <= A[i][j], B <= 106


Input Format

The first argument given is the integer matrix A.
The second argument given is the integer B.


Output Format

Return 1 if B is present in A, else return 0.


Example Input

Input 1:

A = [
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]
    ]
B = 3

Input 2:

A = [
      [5, 17, 100, 111]
      [119, 120, 127, 131]
    ]
B = 3



Example Output

Output 1:

1

Output 2:

0
 */
public class MatrixSearch {

    public static void main(String[] args) {
        int [][] A = {
                {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 50},
    };
        int B = 37;

        System.out.println(searchMatrix(A, B));
    }

    private static int searchMatrix(int [][] A, int B) {
        for(int i=0;i<A.length;i++){
            int lastVal = A[i][A[i].length-1];
            if(lastVal > B){
                //apply binary search
                int[] arr = A[i];
                int lo=0;
                int hi = arr.length-1;

                while(lo<=hi){
                    int mid = (hi-lo)/2+lo;

                    if(arr[mid]==B){
                        return 1;
                    }else if(arr[mid]<B){
                        lo = mid+1;
                    }else{
                        hi = mid-1;
                    }
                }

                return 0;
            }
            else if(lastVal == B){
                return 1;
            }
        }
        return 0;
    }
}
