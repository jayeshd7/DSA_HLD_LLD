package sdeSheet;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int []ans = twoSum(nums, target);
       for (int ele: ans) {
           System.out.print(ele + " ");
       }

        int [] ans1 = twoSumPair(nums, target);
        for(int ele: ans1){
            System.out.print(ele + " ");
        }
    }

    private static int[] twoSumPair(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    private static int [] twoSum(int[] nums, int target) {
        // hash map with o(n) space
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i= 0; i<nums.length;i++){
//            if(map.containsKey(target - nums[i])){
//                System.out.println("Index1: " + map.get(target - nums[i]) + " Index2: " + i);
//                return "YES";
//            }else {
//                map.put(nums[i], i);
//            }
//        }
//        return "NO";

        // two pointer approach with space complexity o(1)

        int left = 0; int right = nums.length-1;
        while(left<right){
            if(nums[left] + nums[right] == target){
                System.out.println("Index1: " + left + " Index2: " + right);
                return new int[]{left, right};
            }else if(nums[left] + nums[right] < target){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1, -1};

    }



}
