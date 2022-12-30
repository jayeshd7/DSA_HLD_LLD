package LeetCode.DailyStudyPlan;

import java.util.ArrayList;
import java.util.List;

public class AllPathFromSourceToTarget {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{3},{3},{}};
        System.out.println(allPathsSourceTarget(graph));
    }

    private static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, ans, path);
        return ans;
    }

    private static void dfs(int[][] graph, int node, List<List<Integer>> ans, List<Integer> path) {
        if(node == graph.length-1){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int next: graph[node]){
            path.add(next);
            dfs(graph, next, ans, path);
            path.remove(path.size()-1);
        }
    }
}
