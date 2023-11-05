package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

import java.util.ArrayList;
import java.util.List;

public class AllNodeDistanceK {
    public static void main(String[] args) {
        TreeNode nums = new TreeNode(3);
        nums.left = new TreeNode(5);
        nums.right = new TreeNode(1);
        nums.left.left = new TreeNode(6);
        nums.left.right = new TreeNode(2);
        nums.right.left = new TreeNode(0);
        nums.right.right = new TreeNode(8);
        nums.left.right.left = new TreeNode(7);
        nums.left.right.right = new TreeNode(4);


        int k = 2;

        int target = 5;
        System.out.println(distanceK(nums, target, k));
    }

    private static List<Integer> distanceK(TreeNode nums, int target, int k) {
        List<Integer> ans = new ArrayList<>();
        dfsK(nums, target, k, ans);
        return ans;


        
    }

    private static void dfsK(TreeNode nums, int target, int k, List<Integer> ans) {
        if(nums == null){
            return;
        }
        if(k == 0){
            ans.add(nums.val);
            return;
        }
        dfsK(nums.left, target, k-1, ans);
        dfsK(nums.right, target, k-1, ans);
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
