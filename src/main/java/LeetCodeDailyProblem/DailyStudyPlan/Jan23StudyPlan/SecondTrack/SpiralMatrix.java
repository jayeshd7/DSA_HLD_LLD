package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
       ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
               ans.add(matrix[i][right]);
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                   ans.add(matrix[bottom][i]);
                }
                for (int i = bottom; i > top; i--) {
                   ans.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }
}
