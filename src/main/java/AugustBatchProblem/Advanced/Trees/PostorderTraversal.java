package AugustBatchProblem.Advanced.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> ans = new  ArrayList<>();


        //null root
        if(A==null) return ans;

        s.push(A);

        while(!s.empty()){
            A = s.pop();
            ans.add(A.val);
            if(A.left!=null){
                s.push(A.left);
            }
            if(A.right!=null){
                s.push(A.right);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

}
