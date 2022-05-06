package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDifferencePuzzle {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);al.add(12);
        al.add(10);al.add(7);al.add(5);al.add(22);
        int B = 4;
        System.out.println(solve(al, B));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n = A.size();
        int diff = Integer.MAX_VALUE;
        for (int i =0; i<n-B+1;i++){
            diff = Math.min(diff, A.get(i+B-1)-A.get(i));
        }
        return diff;
    }
}
