package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;

public class ContiguousArray {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(1);
        al.add(1);
        al.add(0);

        System.out.println(solve(al));

        //1, 0, 1, 0, 1
        //1  -1 1  -1 1
        //1 0  1   0  1

        // 2 bullest 1. sum -0 2. if duplicate

        // sum = 0

        // 1 1 1 0
        // 1 1 1 -1



        // 1 2 3  2

        // (1-1), (2-1), (3,1),(2,1)


    }

    public static int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm
                = new HashMap<Integer, Integer>();


        int sum = 0;

        int max_len = 0;

        int n = A.size();
        for (int i = 0; i < n; i++) {
            if (A.get(i) == 0) {
                A.set(i, -1);
            }
        }

        for (int i = 0; i < n; i++) {
            sum += A.get(i);

            if (sum == 0) {
                max_len = i + 1;
            }
            // if contains
            if (hm.containsKey(sum)) {
                if (max_len < i - hm.get(sum)) {
                    max_len = i - hm.get(sum);

                }
            } else
                hm.put(sum, i);
        }


        return max_len;
    }
}
