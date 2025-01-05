package sdeSheet;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSuccessiveElements {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(nums);
        System.out.println("Longest Consecutive elements: " + ans);
    }

    private static int longestConsecutive(int[] nums) {
        // optimal solution
//        int n = nums.length;
//        if(n == 0){
//            return 0;
//        }
//        int largest = 1;
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<n;i++){
//            set.add(nums[i]);
//        }
//        for(int i=0;i<n;i++){
//            if(!set.contains(nums[i]-1)){
//                int j = nums[i];
//                while(set.contains(j)){
//                    j++;
//                }
//                largest = Math.max(largest, j-nums[i]);
//            }
//        }
//        return largest;
//    }

        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int largest = 1;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    count++;
                } else {
                    largest = Math.max(largest, count);
                    count = 1;
                }
            }
        }
        return Math.max(largest, count);
    }
}
