package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;

public class FindAllPrimeNumber {

    public static void main(String[] args) {
        int [] ans = sieveOfEratosthenes(20);
        for (int i = 2; i < ans.length; i++)
        {
            if (ans[i] == 1)
                System.out.print(i + " ");
        }
    }

    private static int[] sieveOfEratosthenes(int n) {


        int prime[] = new int[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = 1;

        for (int p = 2; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == 1)
            {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = 0;
            }
        }
        return prime;
    }
}
