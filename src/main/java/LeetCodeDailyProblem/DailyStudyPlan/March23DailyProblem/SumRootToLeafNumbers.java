package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solutionOfSumRootToLeafNumber(root));

    }

    private static int solutionOfSumRootToLeafNumber(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private static int sumNumbers(TreeNode root, int i) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return i*10 + root.val;
        return sumNumbers(root.left, i*10 + root.val) + sumNumbers(root.right, i*10 + root.val);
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
