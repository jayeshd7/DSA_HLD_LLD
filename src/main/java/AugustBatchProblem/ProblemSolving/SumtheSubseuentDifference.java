package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class SumtheSubseuentDifference {

    public static int MOD = 1000000007;

    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(1);al.add(2);al.add(3);
        System.out.println(solve(al));
    }

    private static int solve(ArrayList<Integer> A) {
        int n = A.size();

        Collections.sort(A);


        // horner's rule calc max_sum and min_sum
        long min_sum = 0, max_sum = 0;
        for (int i = 0; i < n; i++)
        {
            max_sum = 2 * max_sum + A.get(n - 1 - i);
            max_sum = max_sum % MOD;
            min_sum = 2 * min_sum + A.get(i);
            min_sum = min_sum % MOD;
        }

        return (int) ((max_sum - min_sum + MOD)%MOD);
    }

}
