package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceBST {
   
    
    public static void main(String[] args) {

       TreeNode root = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

        System.out.println(minimumAbsoluteDifferenceBST(root));
    }

    private static int minimumAbsoluteDifferenceBST(TreeNode root) {

        List<Integer> trav = new ArrayList<>();
        inorder(root, trav);

       int diff = Math.abs(trav.get(1) - trav.get(0));
       for(int i =1; i < trav.size(); i++){
           diff = Math.min(diff, Math.abs(trav.get(i) - trav.get(i - 1)));
       }
       return diff;
        


    }

    private static void inorder(TreeNode root, List<Integer> trav) {
        if(root == null) return;
        inorder(root.left, trav);
        trav.add(root.val);
        inorder(root.right, trav);
    }
}

class TreeNode {
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
