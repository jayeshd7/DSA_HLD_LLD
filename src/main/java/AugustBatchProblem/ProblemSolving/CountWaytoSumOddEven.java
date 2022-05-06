package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class CountWaytoSumOddEven {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);al.add(1);al.add(1);

        System.out.println(solve(al));

    }
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        int ans = 0;
        int lo =0; int le =0;
        int ro =0; int re =0;

        for(int i =1;i<n;i+=2){
            ro += A.get(i);
        }
        for(int i =0; i<n;i+=2){
            re += A.get(i);
        }
        for(int i= 0;i<n;i++) {
            if (i % 2 != 0) {
                ro -= A.get(i);
            } else {
                re -= A.get(i);
            }
            if (lo + re == le + ro) {
                ans++;
            }
            if (i %2 != 0){
                lo +=A.get(i);
            }
            else le+= A.get(i);
        }
        return ans;
    }
}
