package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;

public class PatternMatching2 {

    public static void main(String[] args) {
        solve(5);

        /*
        * [
   [1, 0, 0, 0]
   [1, 2, 0, 0]
   [1, 2, 3, 0]
   [1, 2, 3, 4]
 ]
        * */
    }

    private static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
        for(int row = 0; row<A; row++){
            ArrayList temp  = new ArrayList();
            int col = 0;
            for(col =0; col <= row; col++){

                temp.add(col+1);
            }
            for (; col<A; col++){
                temp.add(0);
            }
            x.add(temp);

        }
        System.out.println(x);
        return x;

    }
}
