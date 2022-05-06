package AugustBatchProblem.Advanced.Trees;

public class NodeMax {
    public int solve(TreeNode A) {
        return nodeMax(A);
    }
    int nodeMax(TreeNode A){
        if (A== null) return 0;
        int leftmax = nodeMax(A.left);
        int rightmax = nodeMax(A.right);
        int res = A.val;

        return Math.max(Math.max(leftmax, rightmax), res);
    }
}
