package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

import java.util.Arrays;

public class ModSum {

    public static void main(String[] args) {
        int [] A = {1,2,3};
        ModSumSolve(A);
    }

    private static int ModSumSolve(int [] a) {
        int mod = 1000000007;
        int n = a.length;
        int max = Arrays.stream(a).max().getAsInt();

        // To store the frequency of each element
        int []cnt=new int[max + 1];

        // Store the frequency of each element
        for (int i = 0; i < n; i++)
            cnt[a[i]]++;

        // To store the required answer
        long ans = 0;

        // For all valid pairs
        for (int i = 1; i <= max; i++)
        {
            for (int j = 1; j <= max; j++)
            {

                // Update the count
                ans = ans + cnt[i] *
                        cnt[j] * (i % j);
                ans = ans % mod;
            }
        }

        return (int)(ans);

    }
}
