package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {5,-1,5};
        System.out.println(maxSubarraySumCircular(nums));
    }

    private static int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0;
        int currMax = 0;
        int currMin = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currMax = Math.max(currMax + nums[i], nums[i]);
            max = Math.max(max, currMax);
            currMin = Math.min(currMin + nums[i], nums[i]);
            min = Math.min(min, currMin);
            total += nums[i];
        }
        return max > 0 ? Math.max(max, total - min) : max;
    }
}
