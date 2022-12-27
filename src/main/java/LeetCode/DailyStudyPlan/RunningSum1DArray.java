package LeetCode.DailyStudyPlan;

public class RunningSum1DArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] ans = runningSum(arr);
    }

    private static int[] runningSum(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1; i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
