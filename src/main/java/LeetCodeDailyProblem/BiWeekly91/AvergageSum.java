package LeetCodeDailyProblem.BiWeekly91;

import java.util.HashSet;

public class AvergageSum {
    public static void main(String[] args) {
        int[] arr = {1,100};
        System.out.println(averageSum(arr));
    }

    private static int averageSum(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<n/2;i++){
            set.add(nums[i]+nums[n-i-1]);
        }
        return set.size();
    }
}
