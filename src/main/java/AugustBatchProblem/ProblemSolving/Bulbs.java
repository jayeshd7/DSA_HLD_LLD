package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class Bulbs {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);al.add(1);al.add(0);al.add(1);
        System.out.println(bulb(al));
    }

    private static int bulb(ArrayList<Integer> A) {
        int ans = 0;
        int n = A.size();
        for(int i =0; i<n;i++){
            if(ans % 2 != 0){
                A.set(i, 1- A.get(i));
            }
            if(A.get(i) == 0){
                ans++;
            }

        }
        return ans;
    }

}
