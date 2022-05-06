package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class BeggarsOutsideTemple {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList1.add(1);arrayList1.add(2);arrayList1.add(10);
        arrayList2.add(2);arrayList2.add(3);arrayList2.add(20);
        arrayList3.add(2);arrayList3.add(5);arrayList3.add(25);
        ArrayList<ArrayList<Integer>> fArrayList = new ArrayList<>();
        //[[1,2,10],[2,3,20],[2,5,25]]

        //[10,55,45,25,25]

        fArrayList.add(arrayList1);
        fArrayList.add(arrayList2);
        fArrayList.add(arrayList3);
        System.out.println(fArrayList);
        int A = 5;
        solve(A, fArrayList);

        /*  prefix sum concept
                0  0  0  0  0
                10 0 -10 0  0
                10 20 -10 -20 0
                10 45 -10 -20 0

                10 55 45 25 25 - answer
         */


    }
    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        int n = B.size();

        ArrayList<Integer>x1 = new ArrayList<>();


        for(int i =0;i<A;i++){
            x1.add(i,0);
        }
        for(int i =0;i<n;i++){
            int lIdx = B.get(i).get(0)-1;
            int rIdx = B.get(i).get(1)-1;
            int donatation = B.get(i).get(2);
            x1.set(lIdx, x1.get(lIdx) + donatation);
            if(rIdx+1 <A) {
                x1.set(rIdx + 1, x1.get(rIdx+1) - donatation);
            }
        }

        for(int i =1; i< A;i++){
            x1.set(i, x1.get(i)+x1.get(i-1));
        }


        System.out.println(x1);

        return x1;
    }
}
