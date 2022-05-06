package AugustBatchProblem.Advanced.Trees;

public class TreeHeight {
    public int solve(TreeNode A) {
        if(A==null) return 0;
        int lr = solve(A.left);
        int rr = solve(A.right);
        int max = Math.max(lr,rr);
        return max+1;
    }
}
