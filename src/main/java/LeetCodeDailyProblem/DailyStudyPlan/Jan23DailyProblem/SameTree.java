package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class SameTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode();
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode();
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);

        System.out.println(isSameTree(root,root2));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        if(p.val != q.val)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
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
