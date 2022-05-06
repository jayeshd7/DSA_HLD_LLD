package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;
import java.util.Collections;

public class ClosestMinMax {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        //al.add(3);
        solve(al);
    }

    private static int solve(ArrayList<Integer>A) {

        int n = A.size();

        int latest_max = -1;
        int latest_min = -1;
        int ans = Integer.MAX_VALUE;

        int min = Collections.min(A);
        int max = Collections.max(A);

        for(int i = 0; i<n ;i++){
            if(A.get(i).equals(min)){
                ans = Math.min(ans, i-latest_max+1);
                latest_min = i;


            }

            if(A.get(i) == max){
                ans = Math.min(ans, i-latest_min+1);
                latest_max = i;
            }



        }
        System.out.println(ans);
        return ans;

    }
}
