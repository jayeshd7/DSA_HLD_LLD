package AugustBatchProblem.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.asList;

public class MinSumPathinTriangle {
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(2);
        ArrayList<Integer>b = new ArrayList<>();
        a.add(3);a.add(4);
        ArrayList<Integer>c = new ArrayList<>();
        a.add(6);a.add(5);a.add(7);
        ArrayList<Integer>d = new ArrayList<>();
        a.add(4);a.add(1);a.add(8);a.add(3);
        ArrayList<ArrayList<Integer>>I = new ArrayList<>();
        I.add(0,a);
        I.add(1,b);
        I.add(2,c);
        I.add(3,d);
        System.out.println(I);

        solveMinSumPathinTriangle(I);
        }





    private static int solveMinSumPathinTriangle(ArrayList<ArrayList<Integer>> a) {
        int rows = a.size();

        // Find the minimum sum, using the original array itself
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < a.get(i).size(); j++) {
                a.get(i).set(j, a.get(i).get(j) + Math.min(a.get(i + 1).get(j), a.get(i + 1).get(j + 1)));
            }
        }

        // Returning the first place holder
        return a.get(0).get(0);
    }
}
