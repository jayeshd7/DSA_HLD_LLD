package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class PickFromBothSide {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);al.add(-2);al.add(3);al.add(1);al.add(2);
        int B = 3;
        System.out.println(solve(al, B));

    }
    public static int solve(ArrayList<Integer> A, int B) {


        int res = 0;
        for (int i = 0; i < B; i++) {
            res += A.get(i);
        }
        int lsum = res, rsum = 0, idx = B - 1, i = A.size() - 1;
        while (idx >= 0) {
            rsum += A.get(i);
            lsum -= A.get(idx);
            res = Math.max(lsum + rsum, res);
            idx--;
            i--;
        }
        return res;

    }


}
