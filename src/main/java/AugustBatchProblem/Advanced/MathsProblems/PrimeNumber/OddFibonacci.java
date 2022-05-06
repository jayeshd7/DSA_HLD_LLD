package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;

/*
Given two integers A and B representing an interval [A, B].

Fibonacci sequence is a sequence whose definition is as follows:

F[1] = 1 , F[2] = 1

F[i] = F[i-1] + F[i-2] for i > 2

Your task is to find the count of integers x in the range [A, B] such that F[x] is odd.


 */

public class OddFibonacci {

    public static void main(String[] args) {
        System.out.println(oddFibonacciSolve(2,6));
    }

    private static int oddFibonacciSolve(int A, int B) {

        int cnt = ((B/3)-(A-1)/3);
        return ((B-A+1)-cnt);
    }
}
