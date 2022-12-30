package LeetCode.DailyStudyPlan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.children = new Node[3];
        root.children[0] = new Node(3);
        root.children[0].children = new Node[2];
        root.children[0].children[0] = new Node(5);
        root.children[0].children[1] = new Node(6);
        root.children[1] = new Node(2);
        root.children[2] = new Node(4);
        System.out.println(preorder(root));
    }

    private static List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            ans.add(node.val);
            for(int i=node.children.length-1; i>=0; i--){
                stack.push(node.children[i]);
            }
        }
        return ans;
    }

    public static class Node {
        public int val;
        public Node[] children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node[] _children) {
            val = _val;
            children = _children;
        }
    }
}
