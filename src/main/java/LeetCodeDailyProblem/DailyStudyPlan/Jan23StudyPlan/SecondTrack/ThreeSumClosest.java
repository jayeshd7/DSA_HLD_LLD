package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[0] + nums[1] + nums[n-1];
        for(int i = 0; i < n-2; i++)
        {
            int j = i+1;
            int k = n-1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                {
                    ans = sum;
                }
                if(sum > target)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return ans;
    }
}
