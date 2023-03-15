package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class CheckCompletenessBinaryTree {
    static int numOfNodes ;
    static int lastIndex ;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(isCompleteTree(root));
    }

    private static boolean isCompleteTree(TreeNode root) {
            if (root == null) {
                return true;
            }
            helper(root, 0);
            return numOfNodes == lastIndex+1;
        }
        private static void helper(TreeNode node, int index) {
            if (node == null) {
                return;
            }
            numOfNodes++;
            // keep tracking last index
            lastIndex = Math.max(index, lastIndex);
            // left index = 2*parentIndex + 1
            helper(node.left, 2*index+1);
            // right index = 2*parentIndex + 2
            helper(node.right, 2*index+2);
        }


    static class  TreeNode {
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
