package AugustBatchProblem.Advanced.MathsProblems.Combinator;

public class ncrmodp {

    public static void main(String[] args) {
        System.out.println(solve(149,12,48157));
    }

    public static int solve(int n, int r, int p) {
        if (n<r)
            return 0;
        // Base case
        if (r == 0)
            return 1;

        // Fill factorial array so that we
        // can find all factorial of r, n
        // and n-r
        int[] fac = new int[n + 1];
        fac[0] = 1;

        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;

        return (fac[n] * modInverse(fac[r], p)
                % p * modInverse(fac[n - r], p)
                % p)
                % p;
    }
    static int modInverse(int n, int p)
    {
        return power(n, p - 2, p);
    }
    static int power(int x, int y, int p)
    {

        // Initialize result
        int res = 1;

        // Update x if it is more than or
        // equal to p
        x = x % p;

        while (y > 0) {

            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }
}
