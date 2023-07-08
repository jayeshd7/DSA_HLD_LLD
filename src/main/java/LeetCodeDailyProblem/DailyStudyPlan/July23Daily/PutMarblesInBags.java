package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

import java.util.Arrays;

public class PutMarblesInBags {
    public static void main(String[] args) {
        int [] weights = {1,3,5,1};
        int  k = 2;
        System.out.println(minimumSize(weights, k));

    }

    private static  long minimumSize(int[] weights, int k) {
       int n = weights.length;
       int [] pairs = new int[n-1];
       for(int i = 1; i < n; i++){
           pairs[i-1] = weights[i] + weights[i - 1];
       }
        Arrays.sort(pairs);
       long minScore = 0;
       long maxScore = 0;
       for(int i = 0; i < k-1; i++){
           minScore += pairs[i];
           maxScore += pairs[n - 2 - i];
       }
       return maxScore - minScore;
    }
}
