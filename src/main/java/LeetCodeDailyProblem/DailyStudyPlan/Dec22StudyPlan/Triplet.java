package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

import java.util.HashSet;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        int[] ans = threeSumClosest(arr, target);
        for (int i : ans) {
            System.out.println(i);
        }

        int [] ans1 = threeSumClosest1(arr, target);
    }

    private static int[] threeSumClosest1(int[] arr, int target) {

        int n = arr.length;
        int [] ans = new int[3];
        for(int i = 0; i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = target-arr[i];
            for(int j = i+1; j<n;j++){
                if(set.contains(curr_sum-arr[j])){
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    ans[2] = curr_sum-arr[j];
                    return ans;
                }
                set.add(arr[j]);
            }
        }
        return ans;
    }

    private static int[] threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[3];
        for(int i =0; i<n;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==target){
                    return new int[]{arr[i],arr[j],arr[k]};
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }


}
