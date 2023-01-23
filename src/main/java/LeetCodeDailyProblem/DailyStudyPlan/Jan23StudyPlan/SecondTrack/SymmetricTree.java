package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean ans = isSymmetric(root);
        System.out.println(ans);
    }

    private static boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return isMirror(root.left,root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if(left==null && right==null)return true;
        if(left==null || right==null)return false;
        return (left.val==right.val) && isMirror(left.left,right.right) && isMirror(left.right,right.left);
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
