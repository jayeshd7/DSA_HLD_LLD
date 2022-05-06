package AugustBatchProblem.Advanced.MathsProblems.GCD;

public class DivisorGame {

    /*
    Scooby has 3 three integers A, B and C.

Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell number of special integers less than or equal to A.
     */
    public static void main(String[] args) {
        System.out.println(divisorGameSolve(12,3,2));
    }

    private static int divisorGameSolve(int A, int B, int C) {

        int lcm = (B*C/__gcd(B,C));
        return (int) Math.floor(A/lcm);
    }

    static int __gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return __gcd(b, a % b);

    }
}
