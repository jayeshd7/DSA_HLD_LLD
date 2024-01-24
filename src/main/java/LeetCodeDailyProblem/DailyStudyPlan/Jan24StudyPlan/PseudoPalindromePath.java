package LeetCodeDailyProblem.DailyStudyPlan.Jan24StudyPlan;

import java.util.HashSet;

public class PseudoPalindromePath {
    static int res = 0;
    public static void main(String[] args) {
        TreeNode nums = new TreeNode(2);
        nums.left = new TreeNode(3);
        nums.right = new TreeNode(1);
        nums.left.left = new TreeNode(3);
        nums.left.right = new TreeNode(1);
        nums.right.right = new TreeNode(1);

        System.out.println(pseudoPalindromicPaths(nums));
    }


    private static int pseudoPalindromicPaths(TreeNode nums) {
        HashSet<Integer> set = new HashSet<>();
        solveDFS(nums, set);
        return res;
    }

    private static void solveDFS(TreeNode nums, HashSet<Integer> set) {
        if(nums == null){
            return;
        }
        if(set.contains(nums.val)){
            set.remove(nums.val);
        }else{
            set.add(nums.val);
        }
        if(nums.left == null && nums.right == null){
            if(set.size() <= 1){
                res++;
            }
        }
        solveDFS(nums.left, set);
        solveDFS(nums.right, set);
        if(set.contains(nums.val)){
            set.remove(nums.val);
        }else{
            set.add(nums.val);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
