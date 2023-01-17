package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.Arrays;

public class NumberOfGoodPaths {
    static int[] parent, count; // parent array to keep track of parent of each node and count array to keep track of number of nodes in each set
    static int res;
    public static void main(String[] args) {
        int [] vals = {1,3,2,1,3};
        int [] [] edges  = {{0,1},{0,2},{2,3},{2,4}};
        System.out.println(numberOfGoodPaths(vals,edges));
    }

    private static int numberOfGoodPaths(int[] vals, int[][] edges) {

        Arrays.sort(edges, (a, b) -> Integer.compare(Math.max(vals[a[0]], vals[a[1]]), Math.max(vals[b[0]], vals[b[1]])));
        int n = vals.length;
        res = n;
        parent = new int[n];
        count = new int[n];
        Arrays.fill(count, 1);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            union(edge[0], edge[1], vals);
        }
        return res;



    }

    private static void union(int x, int y, int[] vals) {
        int parentX = find(x);
        int parentY = find(y);
        if (parentX == parentY) return;
        if(vals[parentX] == vals[parentY]){
            res +=count[parentX]*count[parentY];
            count[parentX] += count[parentY];
            parent[parentY] = parentX;
        }else if(vals[parentX] > vals[parentY]){
            parent[parentY] = parentX;

        }else {
            parent[parentX] = parentY;
        }
    }

     private static int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }


}
