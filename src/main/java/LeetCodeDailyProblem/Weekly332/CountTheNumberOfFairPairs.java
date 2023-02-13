package LeetCodeDailyProblem.Weekly332;

import java.util.Arrays;

public class CountTheNumberOfFairPairs {
    public static void main(String[] args) {
        int[] nums = {1,7,9,2,5};
        int lower = 11;
        int upper = 11;
        System.out.println(countTheNumberOfFairPairs(nums, lower, upper));
    }

    private static long countTheNumberOfFairPairs(int[] nums, int lower, int upper) {

        Arrays.sort(nums);
        int n = nums.length;
        long result = 0;
        for (int i = 0; i<n;i++) {
            int target1 = lower - nums[i];
            int target2 = upper - nums[i];

            int left = i+1;
            int right = n-1;

            while(left<=right){
                int mid = left + (right-left)/2;
                 if(nums[mid]<target1){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            int leftBound = right;

            // finding target2
            right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] <= target2) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // rightBound is the upper bound for acheiving target2
            int rightBound = left - 1;
            result += rightBound - leftBound;
        }
        return result;
        }
}

