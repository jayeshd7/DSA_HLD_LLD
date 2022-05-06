package AugustBatchProblem.Advanced.MathsProblems.GCD;

/*
Given 2 non negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer g such that g is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(gcd(4,6));
    }

    private static int gcd(int a, int b) {

        while(b>0){
            int t = b;
            b = a%b;
            a= t;
        }
        return a;
    }
}
