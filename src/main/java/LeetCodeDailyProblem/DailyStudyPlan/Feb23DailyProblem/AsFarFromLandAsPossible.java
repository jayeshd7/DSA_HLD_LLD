package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarFromLandAsPossible {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        System.out.println(maxDistance(grid));
    }

    public static int maxDistance(int[][] grid) {
        int n = grid.length;
        int[][] distance = new int[n][n];
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        if (queue.size() == 0 || queue.size() == n * n) {
            return -1;
        }
        int maxDistance = -1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int[] direction : directions) {
                int x = current[0] + direction[0];
                int y = current[1] + direction[1];
                if (x >= 0 && x < n && y >= 0 && y < n && !visited[x][y]) {
                    distance[x][y] = distance[current[0]][current[1]] + 1;
                    maxDistance = Math.max(maxDistance, distance[x][y]);
                    queue.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return maxDistance;
    }
}
