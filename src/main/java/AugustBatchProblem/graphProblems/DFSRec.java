package AugustBatchProblem.graphProblems;

import java.util.ArrayList;

public class DFSRec {

    public static void main(String[] args) {
       DFSRec dfsRec = new DFSRec();

        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for(int i = 0; i< v;i++){
            adj.add(new ArrayList<>());

        }
        addEdge(adj, 0,1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 3, 4);
        System.out.println(adj);
        DFS(adj, 5, 0 );

    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int v, int s){
        boolean visited[] = new boolean[v];
        DFSRecursion(adj,s,visited);

    }

    /*
    recursive call for each node with smallest value like
    from 1 ->3,4
    pick 3
    then from 3 -> 2
    from 2  -> we can go 0 or 2 but both are visited then cursor move back to 1
    from 1 -> 4


     */
    private static void DFSRecursion(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        visited[s] = true;
        System.out.println(s + "");
        for(int u: adj.get(s)){
            if(visited[u] == false){
                DFSRecursion(adj, u, visited);

            }
        }

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
