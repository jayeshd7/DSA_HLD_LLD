package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class ColumnSum {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList1.add(1);arrayList1.add(2);arrayList1.add(3);
        arrayList2.add(3);arrayList2.add(4);arrayList2.add(2);
        arrayList3.add(2);arrayList3.add(5);arrayList3.add(5);
        ArrayList<ArrayList<Integer>> fArrayList = new ArrayList<>();
        //[[1,2,10],[2,3,20],[2,5,25]]

        //[10,55,45,25,25]

        fArrayList.add(arrayList1);
        fArrayList.add(arrayList2);
        fArrayList.add(arrayList3);
        System.out.println(fArrayList);
        System.out.println(solve(fArrayList));
    }

    private static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();
        int sumCol;

        ArrayList<Integer>x = new ArrayList<>();
        for(int i = 0; i < cols; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + A.get(j).get(i);

            }
            x.add(sumCol);
        }

        return x;
    }
}
