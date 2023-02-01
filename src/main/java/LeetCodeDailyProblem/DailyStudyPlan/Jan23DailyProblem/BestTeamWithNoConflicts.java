package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.Arrays;

public class BestTeamWithNoConflicts {
    public static void main(String[] args) {
        int[] scores = {1, 3, 5, 10, 15};
        int[] ages = {1, 2, 3, 4, 5};
        System.out.println(bestTeamScore(scores, ages));
    }

    public static int bestTeamScore(int[] scores, int[] ages) {
        int[][] players = new int[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            players[i] = new int[]{ages[i], scores[i]};
        }
        Arrays.sort(players, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int[] dp = new int[scores.length];
        int res = 0;
        for (int i = 0; i < scores.length; i++) {
            dp[i] = players[i][1];
            for (int j = 0; j < i; j++) {
                if (players[i][1] >= players[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + players[i][1]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
