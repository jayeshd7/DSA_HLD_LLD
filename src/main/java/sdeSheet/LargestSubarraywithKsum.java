package sdeSheet;

import java.util.HashMap;

public class LargestSubarraywithKsum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 4, -4};
        int n = 5;
        int ans = largestSubarray(arr, n);
        System.out.println("Largest subarray with sum k: " + ans);
    }

    private static int largestSubarray(int[] arr, int n) {

        int max = 0;
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++) {
            sum += arr[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) {
                   max = Math.max(max, i - map.get(sum));
                }
                else {
                    map.put(sum, i);
                }
            }
        }
        return max;
    }
}
