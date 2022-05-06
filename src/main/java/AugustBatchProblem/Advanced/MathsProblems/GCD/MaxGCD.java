package AugustBatchProblem.Advanced.MathsProblems.GCD;

public class MaxGCD {

    public static void main(String[] args) {
        int [] A = {14, 17, 28, 70};
        System.out.println(MmaxGCDSolve(A));
    }

    private static int MmaxGCDSolve(int [] a) {
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
