package LeetCodeDailyProblem.DailyStudyPlan.May2023;

import java.util.ArrayList;

public class MinimumNumberVertices {

    public static void main(String[] args) {
        int[][] edges = {{0,1},{0,2},{2,5},{3,4},{4,2}};
        int n = 6;
        System.out.println(findSmallestSetOfVertices(n, edges));
    }
    // find smallest
    private static ArrayList<Integer> findSmallestSetOfVertices(int n, int[][] edges) {

        ArrayList<Integer> result = new ArrayList<>();
        int[] inDegree = new int[n];
        for(int[] edge : edges){
            inDegree[edge[1]]++;
        }
        for(int i = 0; i < n; i++){
            if(inDegree[i] == 0){
                result.add(i);
            }
        }
        return result;
    }
}
