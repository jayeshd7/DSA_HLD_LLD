package AugustBatchProblem.Day1;

import java.util.ArrayList;

class simpleNumber {

    public static ArrayList<ArrayList<Integer>> solve(int A) {
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

    public static void main(String args[])
    {
        System.out.println("2D ArrayList :");

        solve(5);

    }
}
