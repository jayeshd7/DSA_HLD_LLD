package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
            j += 2;
        }
        return result;
    }
}
