package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.HashMap;
import java.util.HashSet;

public class FindClosestNodeToGivenTwoNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

    }

    private static int findClosestNodeToGivenTwoNodes(int[] edges, int node1, int node2) {
        HashMap<Integer, Integer> vis = new HashMap<>();
        for (int i=node1, d=0; i>=0 && !vis.containsKey(i); i=edges[i])
            vis.put(i, d++);

        HashSet<Integer> vis2 = new HashSet<>();
        int res=-1, dist = 0, min=Integer.MAX_VALUE;

        for(int i=node2; i>=0 && !vis2.contains(i); i=edges[i]){
            if(vis.containsKey(i)){
                int curr = Math.max(dist, vis.get(i));
                if(res==-1 || curr<=min){
                    res = curr==min ? Math.min(res, i) : i;
                    min = curr;
                }
            }
            dist++; vis2.add(i);
        }
        return res;
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
