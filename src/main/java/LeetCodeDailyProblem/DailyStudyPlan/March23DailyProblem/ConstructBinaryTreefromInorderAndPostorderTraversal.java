package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class ConstructBinaryTreefromInorderAndPostorderTraversal {

    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode root = buildBinaryTree(inorder, postorder);
        System.out.println(root);

    }

    private static TreeNode buildBinaryTree(int[] inorder, int[] postorder) {
        return buildTreeSol(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    private static TreeNode buildTreeSol(int[] inorder, int startInorder, int endInorder, int[] postorder, int startPostOrder, int endPostOrder) {
        if(startInorder > endInorder || startPostOrder > endPostOrder) return null;
        int rootVal = postorder[endPostOrder];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        for(int i = startInorder; i <= endInorder; i++){
            if(inorder[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        int leftTreeSize = rootIndex - startInorder;
        root.left = buildTreeSol(inorder, startInorder, rootIndex-1, postorder, startPostOrder, startPostOrder+leftTreeSize-1);
        root.right = buildTreeSol(inorder, rootIndex+1, endInorder, postorder, startPostOrder+leftTreeSize, endPostOrder-1);
        return root;


    }
}
