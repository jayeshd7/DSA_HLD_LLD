package AugustBatchProblem.Advanced.MathsProblems.Combinator;

/*
Problem Description

Given three integers A, B and C, where A represents n, B represents r and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.

x! means factorial of x i.e. x! = 1 * 2 * 3... * x.



Problem Constraints

1 <= A * B <= 106

1 <= B <= A

1 <= C <= 106



Input Format

The first argument given is integer A ( = n).
The second argument given is integer B ( = r).
The third argument given is integer C ( = m).


Output Format

Return the value of nCr % m.


Example Input

Input 1:

 A = 5
 B = 2
 C = 13

Input 2:

 A = 6
 B = 2
 C = 13



Example Output

Output 1:

 10

Output 2:

 2



Example Explanation

Explanation 1:

 The value of 5C2 % 11 is 10.

Explanation 2:

 The value of 6C2 % 13 is 2.
 */
public class ncrModM {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int p = 11;
        System.out.println(ncrModMSolve(n,r,p));
    }

    private static int ncrModMSolve(int n , int r, int p) {
        if (r > n - r)
            r = n - r;

        // The array C is going to store last
        // row of pascal triangle at the end.
        // And last entry of last row is nCr
        int C[] = new int[r + 1];

        C[0] = 1; // Top row of Pascal Triangle

        // One by constructs remaining rows of Pascal
        // Triangle from top to bottom
        for (int i = 1; i <= n; i++) {

            // Fill entries of current row using previous
            // row values
            for (int j = Math.min(i, r); j > 0; j--)

                // nCj = (n-1)Cj + (n-1)C(j-1);
                C[j] = (C[j] + C[j - 1]) % p;
        }
        return C[r];
    }
}
