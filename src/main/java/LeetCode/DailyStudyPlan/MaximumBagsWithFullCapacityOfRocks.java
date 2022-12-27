package LeetCode.DailyStudyPlan;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityOfRocks {
    public static void main(String[] args){
    int []capacity = {2,3,4,5};
    int [] rocks = {1,2,4,4};
    int additionalRocks = 2;
    int ans = maximumBags(capacity,rocks,additionalRocks);
        System.out.println(ans);

    }

    private static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int [] ans = new int[n];
        for(int i = 0; i<n;i++){
            ans[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(ans); // sorting the difference array
        int count = 0;
        for(int i = 0; i<n;i++){
            if(ans[i]<=additionalRocks){
                count++;
                additionalRocks-=ans[i];
            }
        }
        return count;
    }
}
