package LeetCodeDailyProblem.biweekly317;

import java.util.HashMap;

public class MaximumSubArrayWithDistinct {
    public static void main(String[] args) {
        int [] nums = {1,5,4,2,9,9,9};
        int size = nums.length;
        int k = 3;
        int currSum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<k;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            currSum += nums[i];

        }
        if(map.size() == k){
            ans = currSum;
            System.out.println(ans);
        }
        int left = 0;
        for(int i = k; i<size;i++){
            currSum -= nums[left];
            currSum += nums[i];
            map.put(nums[left], map.get(nums[left])-1);
            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            left++;
            if(map.size() == k){
                ans = Math.max(ans, currSum);
            }
        }
        System.out.println(ans);
    }
}
