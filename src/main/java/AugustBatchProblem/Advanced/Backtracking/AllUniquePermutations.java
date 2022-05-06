package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class AllUniquePermutations {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        //A.add(1);
        A.add(2);
        System.out.println(permute(A));
    }

    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Collections.sort(A);
        boolean[] visited = new boolean[A.size()];
        permuteRecursive(A, new ArrayList<Integer>(), visited);
        return ans;
    }

    public static void permuteRecursive(ArrayList<Integer> A, ArrayList<Integer> temp, boolean[] visited) {
        if (temp.size() == A.size()) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < A.size(); i++) {
            if (visited[i] || i > 0 && A.get(i) == A.get(i - 1) && !visited[i - 1]) {
                continue;
            }
            temp.add(A.get(i));
            visited[i] = true;
            permuteRecursive(A, temp, visited);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
