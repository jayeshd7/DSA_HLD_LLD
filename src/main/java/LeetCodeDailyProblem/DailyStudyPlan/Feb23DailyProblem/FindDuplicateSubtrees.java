package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);
        List<TreeNode> data = findDuplicateSubtrees(root);
        for (TreeNode node : data) {
            System.out.println(node.val);
        }

    }

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        postorder(root, new HashMap<>(), res);
        return res;
    }

    private static String postorder(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
        if (cur == null) return "#";
        String serial = cur.val + "," + postorder(cur.left, map, res) + "," + postorder(cur.right, map, res);
        if (map.getOrDefault(serial, 0) == 1) res.add(cur);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        return serial;
    }

    static class TreeNode {
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
