package LeetCodeDailyProblem.DailyStudyPlan.Jan24StudyPlan;

import java.util.HashMap;

public class NumberOfASubMatricesThatSumToTarget {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,0},{1,1,1},{0,1,0}};
        int target = 0;
        System.out.println(numSubMatrixSumTarget(matrix, target));
    }

    private static int numSubMatrixSumTarget(int[][] matrix, int target) {
        int res = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] sum = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                sum[i][j] = matrix[i-1][j-1] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
            }
        }
        for(int i = 1; i <= m; i++){
            for(int j = i; j <= m; j++){
                int cur = 0;
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int k = 1; k <= n; k++){
                    cur = sum[j][k] - sum[i-1][k];
                    if(cur == target){
                        res++;
                    }
                    if(map.containsKey(cur - target)){
                        res += map.get(cur - target);
                    }
                    map.put(cur, map.getOrDefault(cur, 0) + 1);
                }
            }
        }
        return res;
    }
}
