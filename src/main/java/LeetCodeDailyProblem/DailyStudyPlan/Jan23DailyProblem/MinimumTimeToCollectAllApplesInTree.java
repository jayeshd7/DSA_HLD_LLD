package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.ArrayList;
import java.util.List;

public class MinimumTimeToCollectAllApplesInTree {
    static int count = 0;
    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        int n = edges.length;
        List<Boolean> hasApple = List.of(false,false,true,false,true,true,false);
        System.out.println(minTime(n,edges,hasApple));
    }

    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        dfs(graph, 0, hasApple, new boolean[n]);
        return count;
    }


    private static boolean dfs(List<List<Integer>> graph, int curNode, List<Boolean> hasA, boolean[] visited) {
        if (visited[curNode]) return false;

        visited[curNode] = true;
        boolean res = hasA.get(curNode);
        for (int i = 0; i < graph.get(curNode).size(); i++) {
            if (dfs(graph, graph.get(curNode).get(i), hasA, visited)) {
                count += 2;
                res = true;
            }
        }

        return res;
    }
}
