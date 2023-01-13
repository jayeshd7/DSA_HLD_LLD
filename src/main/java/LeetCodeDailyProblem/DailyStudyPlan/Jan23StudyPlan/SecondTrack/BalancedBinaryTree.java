package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1)return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private static int height(TreeNode root) {
        if(root==null)return 0;
        return Math.max(height(root.left),height(root.right))+1;
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
