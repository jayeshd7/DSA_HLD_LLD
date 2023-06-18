package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class NumberOfIncreasePathInGrid {

    public static void main(String[] args) {

        int [] [] grid = {{1,1},{3,4}};
        System.out.println(numberOfIncreasePathInGrid(grid));
    }

    private static int numberOfIncreasePathInGrid(int[][] grid) {
        int m = grid.length; // number of rows
        int n = grid[0].length; // number of columns

        int[][] memo = new int[m][n];
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int modulo = 1000000007;

        int totalPaths = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalPaths = (totalPaths + dfs(grid, memo, directions, modulo, i, j)) % modulo;
            }
        }

        return totalPaths;
    }
    private static int  dfs(int[][] grid, int[][] memo, int[][] directions, int modulo, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        if (memo[row][col] > 0) {
            return memo[row][col];
        }

        int paths = 0;

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] > grid[row][col]) {
                paths = (paths + dfs(grid, memo, directions, modulo, newRow, newCol)) % modulo;
            }
        }

        paths = (paths + 1) % modulo;
        memo[row][col] = paths;

        return paths;
    }
}
