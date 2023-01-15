package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class PathSumIII {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
        System.out.println(pathSum(root,8));
    }

    private static int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        return pathSumFrom(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private static int pathSumFrom(TreeNode root, int sum) {
        if(root==null)return 0;
        return (root.val==sum?1:0)+pathSumFrom(root.left,sum-root.val)+pathSumFrom(root.right,sum-root.val);
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
