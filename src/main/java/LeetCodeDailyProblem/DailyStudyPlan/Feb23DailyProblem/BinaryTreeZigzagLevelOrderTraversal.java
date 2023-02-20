package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(zigzagLevelOrder(root));
        

    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (isLeftToRight) {
                    level.add(curr.val);
                } else {
                    level.add(0, curr.val);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            output.add(level);
            isLeftToRight = !isLeftToRight;
        }
        return output;
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
