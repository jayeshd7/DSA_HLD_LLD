package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

public class PrimeModuloInverse {

    public static void main(String[] args) {
        PrimeModuloInverseSolve(3,5);
    }

    private static int PrimeModuloInverseSolve(int a, int m) {
        int g = gcd(a, m);
        if (g == 1)

        {
            return power(a, m - 2, m);
        }
        return -1;
    }

    static int power(int x, int y, int m)
    {
        if (y == 0)
            return 1;
        int p = power(x, y / 2, m) % m;
        p = (int)((p * (long)p) % m);
        if (y % 2 == 0)
            return p;
        else
            return (int)((x * (long)p) % m);
    }

    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
