package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class ConvertSortedArrayToBST {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root);
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private static TreeNode helper(int[] nums, int start, int end) {
        if(start > end)return null;
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);
        return root;
    }

    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}
