package AugustBatchProblem.RandomProblems;

import java.util.Arrays;

public class EvenLengthNumber {
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        int n = nums.length;

        int [] ans = new int[n];
        for(int i = 0; i<n;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);

        System.out.println(ans);
    }
}
