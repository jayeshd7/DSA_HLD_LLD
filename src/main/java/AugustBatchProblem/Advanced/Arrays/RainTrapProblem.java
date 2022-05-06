package AugustBatchProblem.Advanced.Arrays;

public class RainTrapProblem {

    public static void main(String[] args) {
        int [] A = {0, 1, 0, 2};
        System.out.println(solve(A));
    }

    private static int solve(int[] a) {
        int res = 0;

        int n = a.length;
        int lMax[] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = a[0];
        for(int i = 1; i < n; i++)
            lMax[i] = Math.max(a[i], lMax[i - 1]);
        rMax[n-1] = a[n-1];
        for(int i = n - 2; i >= 0; i--)
            rMax[i] = Math.max(a[i], rMax[i + 1]);

        for(int i = 1; i < n - 1; i++)
            res = res + (Math.min(lMax[i], rMax[i]) - a[i]);

        return res;
    }
}
