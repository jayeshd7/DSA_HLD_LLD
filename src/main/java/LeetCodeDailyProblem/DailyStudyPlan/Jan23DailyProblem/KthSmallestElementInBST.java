package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class KthSmallestElementInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(kthSmallest(root,1));
    }

    private static int kthSmallest(TreeNode root, int k) {
        int[] count = new int[1];
        int[] result = new int[1];
        helper(root,k,count,result);
        return result[0];
    }

    private static void helper(TreeNode root, int k, int[] count, int[] result) {
        if(root == null)return;
        helper(root.left,k,count,result);
        count[0]++;
        if(count[0] == k){
            result[0] = root.val;
            return;
        }
        helper(root.right,k,count,result);
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
