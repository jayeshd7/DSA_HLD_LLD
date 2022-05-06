package AugustBatchProblem.Advanced.MultiDimArrays;

import java.util.ArrayList;
import java.util.List;

public class MaxDistance {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(3);A.add(5);A.add(4);A.add(2);
        System.out.println(maximumGap(A));

    }
    public static int maximumGap(final List<Integer> A) {
        int maxDiff;
        int i, j;

        int n = A.size();
        int RMax[] = new int[n];
        int LMin[] = new int[n];

        LMin[0] = A.get(0);

        for (i = 1; i < n; ++i) {
            LMin[i] = Math.min(A.get(i), LMin[i - 1]);
        }

        RMax[n - 1] = A.get(n - 1);
        for (j = n - 2; j >= 0; --j) {
            RMax[j] = Math.max(A.get(j), RMax[j + 1]);
        }

        i = 0; j = 0; maxDiff = 0;
        while (j < n && i < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            }
            else {
                i++;
            }
        }

        return maxDiff;
    }
}
