package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {

            int [] nums = {7,4,3,9,1,8,5,2,6};
            int k = 3;
            System.out.println(Arrays.toString(kRadiusSubarrayAverages(nums, k)));

    }

    private static int[] kRadiusSubarrayAverages(int[] nums, int k) {
        int n = nums.length;
        int [] ans = new int[n];
        Arrays.fill(ans, -1);

        long sum = 0;
        int length = 2*k+1;
        if(length>n) return ans;
        for(int i = 0;i<length;i++){
            sum+=nums[i];
        }
        ans[k] = (int)(sum/length);
        int start = 0 ;
        for(int last = length;last<n;last++){
            sum = sum - nums[start]+ nums[last];
            start++;
            ans[last-k] = (int)(sum/length);
        }
        return ans;

    }
}
