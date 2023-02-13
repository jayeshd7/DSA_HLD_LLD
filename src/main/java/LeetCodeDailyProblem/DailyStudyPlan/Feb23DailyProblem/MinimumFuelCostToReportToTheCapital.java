package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.ArrayList;
import java.util.List;

public interface MinimumFuelCostToReportToTheCapital {


    public static void main(String[] args) {
        int [][] roads = {{0,1},{0,2},{0,3}};
        int seats = 5;
        System.out.println(minCost(roads, seats));
    }

    public static long minCost(int[][] roads, int seats) {
        List<Integer>[] graph = new List[roads.length + 1];

        for (int i = 0; i < graph.length; ++i)
            graph[i] = new ArrayList<>();

        for (int[] road : roads) {
            final int u = road[0];
            final int v = road[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(graph, 0, -1, seats);
        return rs;
    }

     long rs = 0;

    private static int dfs(List<Integer>[] graph, int u, int prev, int seats) {
        int people = 1;
        for (final int v : graph[u]) {
            if (v == prev)
                continue;
            people += dfs(graph, v, u, seats);
        }
        if (u > 0)
            // # of cars needed = ceil(people / seats)
           //int rs1 = Integer.par(rs +  (people + seats - 1) / seats);
        return people;
        return people;
    }
}
