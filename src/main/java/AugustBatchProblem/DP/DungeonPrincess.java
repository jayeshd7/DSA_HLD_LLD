package AugustBatchProblem.DP;
/*
Dp-2
 */
import java.util.Arrays;

public class DungeonPrincess {

    public static void main(String[] args) {
        int [][]A = {{-2, -3, 3},{-5, -10, 1},{10, 30, -5}};
        System.out.println(solveDungeonPrincess(A));
    }

    private static int solveDungeonPrincess(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] dp = new int[rows + 1][cols + 1];
        for(int i = 0; i <= rows; i++) {
            Arrays.fill(dp[i], 1);
        }
        for(int i = rows - 1; i >= 0; i--) {
            for(int j = cols - 1; j >= 0; j--) {
                int min = Math.min(dp[i + 1][j], dp[i][j + 1]);
                if(i + 1 >= rows && j + 1 <= cols) min = dp[i][j + 1];
                if(i + 1 <= rows && j + 1 >= cols) min = dp[i + 1][j];
                dp[i][j] = Math.max(min - A[i][j], 1);
            }
        }
        return dp[0][0];
    }
}
