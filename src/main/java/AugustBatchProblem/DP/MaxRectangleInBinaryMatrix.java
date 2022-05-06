package AugustBatchProblem.DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxRectangleInBinaryMatrix {

    public static void main(String[] args) {
        int [][] A = {{1, 1, 1},{0, 1, 1}, {1, 0, 0}};
        System.out.println(solveMaxRectangleInBinaryMatrix(A));
    }

    private static int solveMaxRectangleInBinaryMatrix(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;
        int max = 0;

        int[] rowAdditive = new int[columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (A[i][j] == 0) rowAdditive[j] = 0;
                else rowAdditive[j] += A[i][j];
            }
            max = Math.max(largestAreaRectangle(rowAdditive), max);
        }

        return max;
    }

    private static int largestAreaRectangle(int[] A) {
        int N = A.length;
        if (N == 0) return 0;
        if (N == 1) return A[0];

        //List of height - max
        List<HashMap<Integer, Integer>> maxes = new ArrayList<>();
        int max = A[0];

        HashMap<Integer, Integer> localMax = new HashMap<>();
        for (int i = A[0]; i > 0; i--) {
            localMax.put(i, i);
        }

        maxes.add(localMax);

        for (int i = 1; i < N; i++) {
            HashMap<Integer, Integer> localMaxes = new HashMap<>();
            for (int j = A[i]; j > 0; j--) {
                int val = maxes.get(i - 1).get(j) != null ? maxes.get(i - 1).get(j) + j : j;
                max = Math.max(max, val);
                localMaxes.put(j, val);

            }
            maxes.add(localMaxes);
        }

        return max;
    }
}
