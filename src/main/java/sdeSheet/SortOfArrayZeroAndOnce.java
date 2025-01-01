package sdeSheet;

public class SortOfArrayZeroAndOnce {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortArray(nums);
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }

    private static void sortArray(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int low, int mid) {
        int temp = nums[low];
        nums[low] = nums[mid];
        nums[mid] = temp;
    }
}
