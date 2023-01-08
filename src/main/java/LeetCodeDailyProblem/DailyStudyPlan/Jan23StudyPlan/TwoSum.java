package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan;

import com.google.common.collect.HashBiMap;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 7;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
