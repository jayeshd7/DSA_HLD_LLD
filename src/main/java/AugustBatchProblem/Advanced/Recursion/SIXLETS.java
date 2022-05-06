package AugustBatchProblem.Advanced.Recursion;

import java.util.ArrayList;
/*
Problem Description

Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.



Problem Constraints

1 <= N <= 20

1 <= A[i] <= 1000

1 <= B <= N



Input Format

The first argument given is the integer array A.

The second argument given is the integer B.



Output Format

Return number of subsequences of A of size B having sum <= 1000.


Example Input

Input 1:

    A = [1, 2, 8]
    B = 2

Input 2:

    A = [5, 17, 1000, 11]
    B = 4



Example Output

Output 1:

3

Output 2:

0



Example Explanation

Explanation 1:

 {1, 2}, {1, 8}, {2, 8}

Explanation 1:

 No valid subsequence
 */


public class SIXLETS {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(5);A.add(7);A.add(1000);A.add(11);
        int B = 4;
        System.out.println(solvSixletse(A, B));
    }

    private static int solvSixletse(ArrayList<Integer> a, int b) {
       int sum = 0; int i = 0;
       int n = a.size();

        return solvSixletseRecusrive(i,a,sum,b);
    }

    private static int solvSixletseRecusrive( int i,ArrayList<Integer> a, int sum, int b) {
        if(sum > 1000) return 0;
        if(b == 0) return 1;
        if( i == a.size()) return 0;
        return solvSixletseRecusrive(i+1,a,sum+a.get(i),b-1) + solvSixletseRecusrive(i+1,a,sum,b);

    }
}
