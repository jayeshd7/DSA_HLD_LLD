package AugustBatchProblem.Advanced.Trees;

import java.util.ArrayList;

public class InorderTraversalUsingRecursion {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        int noOfNodes = nodeCount(A);
        ArrayList<Integer> inOrder = new ArrayList<>();
        return inorder(A,inOrder);
    }

    int i = 0;
    public ArrayList<Integer> inorder(TreeNode A, ArrayList<Integer> inOrder)
    {
        if(A == null) return inOrder;
        inorder(A.left,inOrder);
        inOrder.add(A.val);
        inorder(A.right,inOrder);
        return inOrder;

    }

    public int nodeCount(TreeNode A)
    {
        if(A == null) return 0;
        int left = nodeCount(A.left);
        int right = nodeCount(A.right);
        return left+right+1;
    }
}
