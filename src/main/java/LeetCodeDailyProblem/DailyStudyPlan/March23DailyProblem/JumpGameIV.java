package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.util.*;

public class JumpGameIV {
    public static void main(String[] args) {
        int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
        System.out.println(minJumps(arr));
    }

    private static int minJumps(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        boolean[] visited = new boolean[arr.length];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            map.putIfAbsent(arr[i], new ArrayList<Integer>());
            map.get(arr[i]).add(i);
        }
        int step = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                size--;
                int curr = queue.poll();
                if (curr == arr.length-1) return step;
                if (curr + 1 < arr.length && !visited[curr+1]) {
                    visited[curr+1] = true;
                    queue.offer(curr+1);
                }
                if (curr - 1 >= 0 && !visited[curr-1]) {
                    visited[curr-1] = true;
                    queue.offer(curr-1);
                }
                if (map.containsKey(arr[curr])) {
                    for (int next: map.get(arr[curr])) {
                        if (next == curr) continue;
                        if (!visited[next]) {
                            visited[next] = true;
                            queue.offer(next);
                        }
                    }
                    map.remove(arr[curr]);
                }

            }
            step++;
        }
        return -1;
    }
}
