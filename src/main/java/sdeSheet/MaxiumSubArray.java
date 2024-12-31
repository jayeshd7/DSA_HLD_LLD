package sdeSheet;

public class MaxiumSubArray {

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int ans = maxSubArray(nums);
        System.out.println("Maximum sum of subarray: " + ans);
    }

    private static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<n;i++){
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}
