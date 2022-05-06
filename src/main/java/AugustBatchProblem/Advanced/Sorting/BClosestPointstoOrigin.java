package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;

public class BClosestPointstoOrigin {

    public static void main(String[] args) {
        int [][] A = {{1,3},{-2,2}};
        int B = 1;
        System.out.println(solveBClosestPointstoOrigin(A,B));
    }
    public static int[][] solveBClosestPointstoOrigin(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> {  // comparator
            return dis(p1) - dis(p2); // <
        });
        int[][] result = new int[K][];
        for (int i = 0; i < K; ++i) {
            result[i] = new int[] { points[i][0], points[i][1] };
        }
        return result;
    }
    private static int dis(int[] p) { // square
        return p[0] * p[0] + p[1] * p[1];
    }

}
