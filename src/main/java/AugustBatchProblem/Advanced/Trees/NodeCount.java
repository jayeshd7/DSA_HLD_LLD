package AugustBatchProblem.Advanced.Trees;

public class NodeCount {
    public int solve(TreeNode A) {
        if(A==null){
            return 0;
        }
        return solve(A.left)+solve(A.right)+1;
    }
}
