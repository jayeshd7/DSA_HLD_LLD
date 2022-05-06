package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class AntsDie {

    public static void main(String[] args) {
    int n =4;
    ArrayList<Integer>left = new ArrayList<>();
    left.add(4);left.add(3);
    ArrayList<Integer>right = new ArrayList<>();
    right.add(0);right.add(1);
        System.out.println(solve(n,left,right));

    }
    public static int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        Collections.sort(B);
        Collections.sort(C);
        int ans = 0;
        if(B.size() > 0 && C.size() >0) {
            ans = Math.max(A - C.get(0), B.get(B.size() - 1) - 0);
            return ans;
        }
        if(B.size() >0 && C.size() ==0){
            return B.get(B.size() - 1) - 0;
        }
        if(B.size() == 0 && C.size() >0){
            return A - C.get(0);
        }



        return -1;
    }
}
