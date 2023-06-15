package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxiumLevelSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(7);
        TreeNode right = new TreeNode(0);
        TreeNode leftLeft = new TreeNode(7);
        TreeNode leftRight = new TreeNode(-8);

        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;

        System.out.println(maximumLevelSum(root));
    }

    private static int  maximumLevelSum(TreeNode root) {
        int maxLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        int level = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node != null) {
                    sum += node.val;
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

            }

            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;

    }
}

