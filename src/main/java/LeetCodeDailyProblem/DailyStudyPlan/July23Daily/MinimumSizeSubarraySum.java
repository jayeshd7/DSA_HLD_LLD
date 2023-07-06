package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(right < n){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
