package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.HashMap;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }

    private static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        hashMap.put(0,1);
        for(int i = 0;i<nums.length;i++){
            prefixSum = (prefixSum + nums[i])%k;
            if(prefixSum<0) prefixSum +=k;
            if(hashMap.containsKey(prefixSum)){

                ans = ans+hashMap.get(prefixSum);


                hashMap.put(prefixSum,hashMap.get(prefixSum)+1);
            }else{
                hashMap.put(prefixSum,1);
            }

        }
        return ans;
    }
}
