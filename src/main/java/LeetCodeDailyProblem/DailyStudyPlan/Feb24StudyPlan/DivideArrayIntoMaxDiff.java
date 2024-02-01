package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoMaxDiff {
    public static void main(String[] args) {
        int [] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(maximumDifference(nums, k));
        
    }

    private static List<List<Integer>> maximumDifference(int[] nums, int k) {

        int size = nums.length;
        if (size % 3 != 0)
            return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int groupIndex = 0;
        for (int i = 0; i < size; i += 3) {
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                result.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
                groupIndex++;
            } else {
                return new ArrayList<>();
            }

        }

        return  result;

    }
}
