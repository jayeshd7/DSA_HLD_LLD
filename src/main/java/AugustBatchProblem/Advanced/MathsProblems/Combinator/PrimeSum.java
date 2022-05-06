package AugustBatchProblem.Advanced.MathsProblems.Combinator;


/*Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
[a, b] < [c, d], If a < c OR a==c AND b < d.

NOTE: A solution will always exist. Read Goldbach's conjecture.



Problem Constraints

4 <= A <= 2*107


Input Format

First and only argument of input is an even number A.


Output Format

Return a integer array of size 2 containing primes whose sum will be equal to given number.


Example Input

 4



Example Output

 [2, 2]


*
*  */

import java.util.ArrayList;

public class PrimeSum {
    public static void main(String[] args) {
        primesum(4);
    }
    public static ArrayList<Integer> primesum(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        double sqrt = Math.sqrt(n);
        for (int i = 2; i < n; i ++) {
            if (isPrime(i) && isPrime(n - i)) {
                result.add(i);
                result.add(n-i);
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
