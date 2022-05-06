package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class FindDeterminant {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList1.add(1);arrayList1.add(2);
        arrayList2.add(3);arrayList2.add(4);
       // arrayList3.add(2);arrayList3.add(5);arrayList3.add(25);
        ArrayList<ArrayList<Integer>> fArrayList = new ArrayList<>();
        //[[1,2,10],[2,3,20],[2,5,25]]

        //[10,55,45,25,25]

        fArrayList.add(arrayList1);
        fArrayList.add(arrayList2);
        //fArrayList.add(arrayList3);
        System.out.println(fArrayList);
        System.out.println(solve(fArrayList));
    }

    private static int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();

        if (n == 2) {
            return ((A.get(0).get(0) * A.get(1).get(1)) - (A.get(0).get(1) * A.get(1).get(0)));
        }

        int x = (A.get(1).get(1) * A.get(2).get(2)) - (A.get(2).get(1) * A.get(1).get(2));
        int y = (A.get(1).get(0) * A.get(2).get(2)) - (A.get(2).get(0) * A.get(1).get(2));
        int z = (A.get(1).get(0) * A.get(2).get(1)) - (A.get(2).get(0) * A.get(1).get(1));

        int determinant = (A.get(0).get(0) * x)- (A.get(0).get(1) * y) + (A.get(0).get(2) * z);
        return determinant;
    }
}

