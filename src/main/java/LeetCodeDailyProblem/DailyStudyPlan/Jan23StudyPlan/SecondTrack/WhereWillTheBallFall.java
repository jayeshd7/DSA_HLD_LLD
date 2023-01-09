package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class WhereWillTheBallFall {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        System.out.println(findBall(grid));
    }

    private static int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int col = i;
            for (int row = 0; row < m; row++) {
                if (grid[row][col] == 1) {
                    if (col == n - 1 || grid[row][col + 1] == -1) {
                        col = -1;
                        break;
                    }
                    col++;
                } else {
                    if (col == 0 || grid[row][col - 1] == 1) {
                        col = -1;
                        break;
                    }
                    col--;
                }
            }
            ans[i] = col;
        }
        return ans;
    }
}
