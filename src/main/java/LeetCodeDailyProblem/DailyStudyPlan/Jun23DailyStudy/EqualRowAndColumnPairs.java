package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public static void main(String[] args) {
        int [] [] grid = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalRowAndColumnPairs(grid));
    }

    private static int equalRowAndColumnPairs(int[][] grid) {
        int count = 0;
        Map<String, Integer> rowCount = new HashMap<>();


        for(int [] row: grid){
            String key = Arrays.toString(row);
            rowCount.put(key, rowCount.getOrDefault(key, 0) + 1);

        }

        for(int col = 0; col < grid[0].length; col++){
            int [] column = new int[grid.length];
            for(int row = 0; row < grid.length; row++){
                column[row] = grid[row][col];
            }
            String key = Arrays.toString(column);
            count += rowCount.getOrDefault(key, 0);
        }
        return count;

    }
}
