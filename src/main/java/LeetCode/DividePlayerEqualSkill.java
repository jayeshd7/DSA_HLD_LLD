package LeetCode;

import java.util.Arrays;

public class DividePlayerEqualSkill {
    public static void main(String[] args) {
        int [] arr = {3,2,5,1,3,4};
        System.out.println(dividePlayerEqualSkill(arr));
    }

    private static int dividePlayerEqualSkill(int[] arr) {
        int ans = 0;
        int n = arr.length;
        Arrays.sort(arr);
        int sum = arr[0]+arr[n-1];
        ans = arr[0]*arr[n-1];
        int left = 1;
        int right = n-2;
        while(left<right){

            int curr = arr[left]+arr[right];
            if(curr !=sum){
                return -1;
            }
            ans += arr[left++]*arr[right--];
        }
        return ans;

    }
}
