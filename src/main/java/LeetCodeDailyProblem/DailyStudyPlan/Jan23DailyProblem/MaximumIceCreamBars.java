package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] costs = {1, 3, 2, 4, 1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }

    private static int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++) {
            if(costs[i]<=coins) {
                count++;
                coins -= costs[i];
            }
        }
        return count;
    }
}
