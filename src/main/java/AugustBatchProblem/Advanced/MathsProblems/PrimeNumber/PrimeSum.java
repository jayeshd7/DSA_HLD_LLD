package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;

import java.util.ArrayList;

/*
Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
[a, b] < [c, d], If a < c OR a==c AND b < d.

NOTE: A solution will always exist. Read Goldbach's conjecture.
 */
public class PrimeSum {

    public static void main(String[] args) {
        System.out.println(primeSumSolve(4));
    }

    private static ArrayList<Integer> primeSumSolve(int A) {
        
        ArrayList<Integer> result = new ArrayList<>();

        double sqrt = Math.sqrt(A);
        for (int i = 2; i < A; i ++) {
            if (isPrime(i) && isPrime(A - i)) {
                result.add(i);
                result.add(A-i);
                return result;
            }
        }
        return result;
    }

    private static boolean isPrime(int a) {
        if (a == 1) { return false; }

        for (int i = 2; i <= Math.pow(a, 0.5); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }


}

