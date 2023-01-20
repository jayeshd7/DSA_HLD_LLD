package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {
    public static void main(String[] args) {
        int [] nums = {4,6,7,7};
        List<List<Integer>> lists = nonDecreasingSubsequences(nums);
        System.out.println(lists);
    }

    private static List<List<Integer>> nonDecreasingSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfsForNonDecreasing(nums,0,new ArrayList<>(),ans);
        return ans;


    }

    private static void dfsForNonDecreasing(int[] nums, int s, ArrayList<Integer> path, List<List<Integer>> ans) {
        if(path.size()>1){
            ans.add(new ArrayList<>(path));
        }
        Set<Integer> set = new HashSet<>();
        for(int i = s;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            if(path.size()==0 || nums[i]>=path.get(path.size()-1)){
                set.add(nums[i]);
                path.add(nums[i]);
                dfsForNonDecreasing(nums,i+1,path,ans);
                path.remove(path.size()-1);
            }
        }

    }
}
