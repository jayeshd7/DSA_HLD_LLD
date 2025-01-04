package sdeSheet;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println("Majority element: " + ans);

    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> element: map.entrySet()){
            if(element.getValue() > n/2){
                return element.getKey();
            }

            // or you can use simple for loop

//            for(int i=0;i<n;i++){
//                if(map.get(nums[i]) > n/2){
//                    return nums[i];
//                }
//            }
        }
        return -1;
    }
}
