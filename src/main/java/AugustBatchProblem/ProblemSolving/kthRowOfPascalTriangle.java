package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class kthRowOfPascalTriangle {
    public static void main(String[] args) {
        System.out.println(solve(3));

    }

    public static ArrayList<Integer> solve(int A) {
        int n = A+1;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
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
            int rowSize = n;
            while(tempSize != rowSize){
                temp.add(0);
                tempSize = temp.size();
            }

            list.add(temp);
        }

        return list.get(n-1);



    }
}
