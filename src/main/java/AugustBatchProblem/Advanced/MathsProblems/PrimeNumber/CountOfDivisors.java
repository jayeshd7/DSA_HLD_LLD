package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;


/*
Given an array of integers A, find and return the count of divisors of each element of the array.

NOTE: Order of the resultant array should be same as the input array.
 */
public class CountOfDivisors {

    public static void main(String[] args) {
        int []A = {2,3,4,5};
        int [] ans = countOfDivisorsSolve(A);
        for(int i =0;i < ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    private static int[] countOfDivisorsSolve(int [] A) {
        int n = A.length;
        int [] d = new int[n];

        for(int i =0; i<n;i++){
            int value = countDivisors(A[i]);
            d[i] = value;
        }
        return d;
    }
    static int countDivisors(int n)
    {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                // If divisors are equal,
                // count only one
                if (n / i == i)
                    cnt++;

                else // Otherwise count both
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }
}
