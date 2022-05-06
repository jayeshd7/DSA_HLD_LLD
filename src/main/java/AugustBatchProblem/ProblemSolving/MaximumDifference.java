package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumDifference {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);al.add(17);al.add(100);al.add(11);
        int B = 3;
        System.out.println(solve(al,B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int sum = A.stream().reduce(0,(a,b)->a+b);
        Collections.sort(A);
        int bsum =0;
        if(B< (A.size()/2)){
            for(int i =0;i<B;i++){
                bsum +=A.get(i);
            }
        }else {
            for(int i =A.size()-1;i>=A.size()-B;i--){
                bsum+= A.get(i);
            }
        }
        int ans = Math.abs(2*bsum - sum);
        return ans;

        }
}
