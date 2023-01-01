package LeetCode.DailyStudyPlan;

public class UniquePathsIII {
    public static void main(String[] args) {
        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePathsIII(grid));
    }

    private static int uniquePathsIII(int[][] grid) {
        int count = 0;
        int startRow = 0;
        int startCol = 0;
        int endRow = 0;
        int endCol = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                } else if (grid[i][j] == 2) {
                    endRow = i;
                    endCol = j;
                } else if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        return dfs(grid, startRow, startCol, endRow, endCol, count);
    }

    private static int dfs(int[][] grid, int startRow, int startCol, int endRow, int endCol, int count) {
        if (startRow < 0 || startRow >= grid.length || startCol < 0 || startCol >= grid[0].length || grid[startRow][startCol] == -1) {
            return 0;
        }
        if (startRow == endRow && startCol == endCol) {
            return count == -1 ? 1 : 0;
        }
        grid[startRow][startCol] = -1;
        int ans = dfs(grid, startRow + 1, startCol, endRow, endCol, count - 1) +
                dfs(grid, startRow - 1, startCol, endRow, endCol, count - 1) +
                dfs(grid, startRow, startCol + 1, endRow, endCol, count - 1) +
                dfs(grid, startRow, startCol - 1, endRow, endCol, count - 1);
        grid[startRow][startCol] = 0;
        return ans;
    }
}
