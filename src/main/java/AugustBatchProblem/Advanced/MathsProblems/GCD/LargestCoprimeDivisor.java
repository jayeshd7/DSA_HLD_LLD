package AugustBatchProblem.Advanced.MathsProblems.GCD;

/*
Problem Description

You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
 */

public class LargestCoprimeDivisor {

    public static void main(String[] args) {
        System.out.println(largestCoprimeDivisorSolve(30,12));
        
        
    }

    private static int largestCoprimeDivisorSolve(int A, int B) {
        while (gcd(A,B) != 1) {
            A = A/gcd(A,B);
        }
        return A;
    }
    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        } else {
            return gcd(B, A%B);
        }

    }

}
