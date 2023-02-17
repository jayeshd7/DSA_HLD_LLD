package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class MinimumDistanceBetweenBSTNodes {
    static TreeNode prev;
    static Integer ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(minDiffInBST(root));
    }

    public static int minDiffInBST(TreeNode root) {
        minDistanceDfs(root);
        return ans;
    }

    private static void minDistanceDfs(TreeNode node) {
        if(node == null) return;
        minDistanceDfs(node.left);
        if(prev != null) ans = Math.min(ans, node.val - prev.val);
        prev = node;
        minDistanceDfs(node.right);

    }

    static class TreeNode {
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
