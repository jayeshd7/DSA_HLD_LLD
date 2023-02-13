package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class ShortestPathWithAlternativeColors {
    public static void main(String[] args) {
        int n = 5;
        int[][] red_edges = {{0,1},{1,2},{2,3},{3,4}};
        int[][] blue_edges = {{1,2},{2,3},{3,1}};
        int[] result = shortestAlternatingPaths(n, red_edges, blue_edges);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        result[0] = 0;
        boolean[] visited = new boolean[n];
        dfs(0, red_edges, blue_edges, result, visited, 0, true);
        return result;
    }

    public static void dfs(int node, int[][] red_edges, int[][] blue_edges, int[] result, boolean[] visited, int distance, boolean isRed) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        if (result[node] == -1 || result[node] > distance) {
            result[node] = distance;
        }
        if (isRed) {
            for (int i = 0; i < red_edges.length; i++) {
                if (red_edges[i][0] == node) {
                    dfs(red_edges[i][1], red_edges, blue_edges, result, visited, distance + 1, false);
                }
            }
        } else {
            for (int i = 0; i < blue_edges.length; i++) {
                if (blue_edges[i][0] == node) {
                    dfs(blue_edges[i][1], red_edges, blue_edges, result, visited, distance + 1, true);
                }
            }
        }
    }
}
