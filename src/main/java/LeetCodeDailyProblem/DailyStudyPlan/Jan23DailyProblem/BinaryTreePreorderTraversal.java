package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode();
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);


        System.out.println(binaryTreePreOrderTraversal(root));
    }

    private static List<Integer> binaryTreePreOrderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inOrderDfs(root,l);
        return l;

    }
    static void inOrderDfs(TreeNode root, List<Integer> l){
        if(root == null)return;
        l.add(root.val);
        inOrderDfs(root.left,l);
        inOrderDfs(root.right,l);
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
