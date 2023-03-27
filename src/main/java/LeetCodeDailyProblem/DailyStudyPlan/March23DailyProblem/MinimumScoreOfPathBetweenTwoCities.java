package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.util.HashMap;

public class MinimumScoreOfPathBetweenTwoCities {

    public static void main(String[] args) {
        int [] [] roads = {{1,2,9},{2,3,6},{2,4,5},{1,4,7}};
        int n = 4;
        System.out.println(minimumScoreOfPathBetweenTwoCitiesSolution(roads, n));
    }

    private static int minimumScoreOfPathBetweenTwoCitiesSolution(int[][] roads, int n) {
        HashMap<Character, Integer>map = new HashMap<>();
        int [] [] dp = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < roads.length; i++){
            int [] road = roads[i];
            int from = road[0] - 1;
            int to = road[1] - 1;
            int cost = road[2];
            dp[from][to] = Math.min(dp[from][to], cost);
            dp[to][from] = Math.min(dp[to][from], cost);
        }
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(dp[i][k] != Integer.MAX_VALUE && dp[k][j] != Integer.MAX_VALUE){
                        dp[i][j] = Math.min(dp[i][j], Math.max(dp[i][k], dp[k][j]));
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
