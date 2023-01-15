package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int left = height(root.left);
        int right = height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(left+right,Math.max(leftDiameter,rightDiameter));
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
