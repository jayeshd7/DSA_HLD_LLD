package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class CountNegativeInSortedMatrix {

    public static void main(String[] args) {

        int [] [] grid = {{4,3,2,-1},
                          {3,2,1,-1},
                          {1,1,-1,-2},
                          {-1,-1,-2,-3}};

        System.out.println(countNegative(grid));
    }

    private static int countNegative(int[][] grid) {

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int row = rows -1;
        int col = 0;

        while (row >= 0 && col < cols) {
            if (grid[row][col] < 0) {
                count += cols - col;
                row--;
            } else {
                col++;
            }
        }
        return count;


    }
}
