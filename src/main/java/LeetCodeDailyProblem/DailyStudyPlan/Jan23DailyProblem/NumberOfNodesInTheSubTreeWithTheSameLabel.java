package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.ArrayList;
import java.util.List;

public class NumberOfNodesInTheSubTreeWithTheSameLabel {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";
        int[] ans = countSubTrees(n,edges,labels);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] ans = new int[n];
        List<Integer>[] graph = new List[n];

        for (int i = 0; i < n; ++i)
            graph[i] = new ArrayList<>();

        for (int[] edge : edges) {
            final int u = edge[0];
            final int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        dfs(graph, 0, -1, labels, ans);

        return ans;
    }

    private static int[] dfs(List<Integer>[] graph, int u, int parent, final String labels, int[] ans) {
        int[] count = new int[26]; // Count of letters down from this u

        for (final int v : graph[u]) {
            if (v == parent)
                continue;
            int[] childCount = dfs(graph, v, u, labels, ans);
            for (int i = 0; i < 26; ++i)
                count[i] += childCount[i];
        }

        ans[u] = ++count[labels.charAt(u) - 'a']; // The u itself
        return count;
    }
}
