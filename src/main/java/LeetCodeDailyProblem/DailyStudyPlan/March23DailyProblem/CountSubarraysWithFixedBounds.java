package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class CountSubarraysWithFixedBounds {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        System.out.println(countSubarrays(nums, minK, maxK));
    }

    private static long  countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int n = nums.length;
        int minIdx = -1, maxIdx = -1;
        int start = 0;

        for(int i =0; i<n;i++){
            if(nums[i] < minK || nums[i] > maxK){
                start = i+1;
                minIdx = -1;
                maxIdx = -1;
            }
            if(nums[i] == minK){
                minIdx = i;
            }
            if(nums[i] == maxK){
                maxIdx = i;
            }
           count += Math.max(0, Math.min(minIdx, maxIdx) - start + 1);
            }
        return count;
    }
}
