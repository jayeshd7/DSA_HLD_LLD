package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String[] args) {
        solve(4);

    }

    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (A == 0) {
            return list;
        }
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                }
                else {
                    temp.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }

            }
            int tempSize = temp.size();
            int rowSize = A;
            while(tempSize != rowSize){
                temp.add(0);
                tempSize = temp.size();
            }

            list.add(temp);
        }
        System.out.println(list);
        return list;



    }
}
