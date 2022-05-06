package AugustBatchProblem.Advanced.MathsProblems.GCD;

/*
Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.
 */

public class Deleteone {
    public static void main(String[] args) {
        int [] A = {12,15,18};
        solve(A);
        
    }

    private static int solve(int[] a) {
        int n = a.length;

        int Prefix[] = new int[n + 2];
        int Suffix[] = new int[n + 2] ;

        Prefix[1] = a[0];
        for (int i = 2; i <= n; i++)
        {
            Prefix[i] = gcd(Prefix[i - 1], a[i - 1]);
        }

        // Initializing Suffix array
        Suffix[n] = a[n - 1];
        for (int i = n - 1; i >= 1; i--)
        {
            Suffix[i] = gcd(Suffix[i + 1], a[i - 1]);
        }

        int ans = Math.max(Suffix[2], Prefix[n - 1]);

        for (int i = 2; i < n; i++)
        {
            ans = Math.max(ans, gcd(Prefix[i - 1], Suffix[i + 1]));
        }

        // Return the maximized gcd
        return ans;
    }

    private static int gcd(int a, int b) {
        {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }
    }
}
