package LeetCodeDailyProblem.Weekly332;

public class FindTheArrayConcatenationValue {
    public static void main(String[] args) {
        int [] nums = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums));
    }

    private static long findTheArrayConcVal(int[] nums) {

        int n = nums.length;
        long result = 0;
        for(int i =0;i<n/2;i++) {

            String s = String.valueOf(nums[i]) + String.valueOf(nums[n - i-1]);
            result += Long.parseLong(s);
        }
        if(n%2!=0) {
            result += nums[n/2];
        }
    return result;
    }
}
