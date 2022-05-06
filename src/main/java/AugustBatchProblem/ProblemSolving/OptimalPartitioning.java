package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class OptimalPartitioning {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);al.add(1);al.add(3);al.add(2);al.add(4);al.add(3);
                //3, 1, 2, 6, 4
        //2, 1, 3, 2, 4, 3
        // 1 2 3 4 6
        // 1 2 3  -- 4,6
        System.out.println(solve(al));
    }

    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        int diff = Integer.MAX_VALUE;
        int idx = -1;
        Collections.sort(A);
        for(int i =0; i<n-1;i++){
            if(A.get(i+1)-A.get(i) <= diff){
                diff = A.get(i+1)-A.get(i);
                idx = i;
            }
        }
        ArrayList<Integer>B = new ArrayList<>();
        for(int i =0;i<idx;i++){
            B.add(A.get(i));
        }
        ArrayList<Integer>C = new ArrayList<>();
        for(int i =idx;i<n;i++){
            C.add(A.get(i));
        }
        System.out.println(B);
        System.out.println(C);
        return diff;
    }
}
