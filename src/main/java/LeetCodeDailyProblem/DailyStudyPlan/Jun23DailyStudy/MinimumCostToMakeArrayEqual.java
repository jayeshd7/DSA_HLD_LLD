package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class MinimumCostToMakeArrayEqual {

    public static void main(String[] args) {
        int [] nums = {1,3,5,2};
        int [] cost = {2,3,1,14};
        System.out.println(minCost(nums, cost));
    }

    public static long minCost(int[] nums, int[] cost) {
        int left = nums[0];
        int right = nums[0];
        for (int i : nums) {
            left = Math.min(left, i);
            right = Math.max(right, i);
        }
        long ans = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            long cost1 = helper(nums, cost, mid);
            long cost2 = helper(nums, cost, mid + 1);
            if (cost1 > cost2) {
                left = mid + 1;
                ans = cost2;
            } else {
                right = mid;
                ans = cost1;
            }

        }
        return ans;
    }

    public static long helper(int[] nums, int[] cost, int all) {
        long totalCost = 0L;
        for (int i = 0; i < nums.length; i++) {
            totalCost += (long) Math.abs(nums[i] - all) * cost[i];
        }
        return totalCost;
    }

}
