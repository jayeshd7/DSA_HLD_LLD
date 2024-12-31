package sdeSheet;

public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextPermutation(nums);
        for(int ele: nums) {
            System.out.print(ele + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;

        // Step 1: Find the breakpoint
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the smallest element larger than nums[i]
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the subarray to the right of i
        reverse(nums, i + 1, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
