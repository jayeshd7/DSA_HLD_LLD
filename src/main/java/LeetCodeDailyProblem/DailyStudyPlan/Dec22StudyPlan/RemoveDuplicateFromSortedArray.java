package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}
