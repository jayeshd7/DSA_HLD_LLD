package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;

public class PatternMatching1 {

    public static void main(String[] args) {
        solve(5);

        /*
        * [
   [0, 0, 0, 1]
   [0, 0, 2, 1]
   [0, 3, 2, 1]
   [4, 3, 2, 1]
 ]
        * */
    }

    private static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
        int i =0;
        int j = A-1;


            for(i = 0;i<=A-1;i++){
                ArrayList<Integer> temp = new ArrayList<>();
               for(j =0;j<A;j++){
                   temp.add(0);
               }
                x.add(temp);

            }

            for(i =0;i<A;i++){
                int k = 1;
                for(j=A-1;j>=A-i-1;j--){
                    x.get(i).set(j,k);
                    k++;
                }

            }

        System.out.println(x);
        return x;

    }
}
