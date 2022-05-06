package AugustBatchProblem.Advanced.Arrays;

import java.util.ArrayList;

public class MinimumNumberOfJumps {

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
       // ArrayList al = (ArrayList) Arrays.asList(A);
        ArrayList<Integer>al = new ArrayList<>();
        for(Integer i : A){
            al.add(i);
        }
        System.out.println(solve(al));
        
    }

    private static int solve(ArrayList<Integer> A) {

        if(A.size() == 1){
            return 0;
        }
        int jumps = 1;
        int lastReach = A.get(0);
        int maxReach = A.get(0);
        for(int i=1; i<A.size(); i++){
            if(maxReach < i){
                return -1;
            }
            if(lastReach < i){
                jumps++;
                lastReach = maxReach;
            }
            maxReach = Math.max(maxReach, i + A.get(i));
        }
        return jumps;
    }
}
