package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class XorQueries {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(0);A.add(0);A.add(0);A.add(1);
        ArrayList<ArrayList<Integer>> arraylist2D = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1=new ArrayList();
        list1.add(2);
        list1.add(4);


// Create second list
        ArrayList<Integer> list2=new ArrayList();
        list2.add(1);
        list2.add(5);

        ArrayList<Integer> list3=new ArrayList();
        list3.add(1);
        list3.add(5);
        arraylist2D.add(list3);arraylist2D.add(list2);arraylist2D.add(list1);
       // System.out.println(arraylist2D);
        /*int A1 [] = {1,0,0,0,1};
        int B [][] = {{2,4},{1,5},{3,5} };*/

       System.out.println(solve(A, arraylist2D));


    }
    public static int[][] solve1(int[] A, int[][] B) {
        int[] sumOfZero = new int[A.length];

        int prefix[] = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] ^ A[i];
        }
        if (A[0] == 0) sumOfZero[0] = 1;
        else sumOfZero[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == 0) {
                sumOfZero[i] = sumOfZero[i - 1] + 1;
            } else {
                sumOfZero[i] = sumOfZero[i - 1];
            }

        }
        for (int j = 0; j < B.length; j++) {
            int Left = B[j][0]-1;
            int Right = B[j][1]-1;


            if (Left == 0)
                B[j][1] = sumOfZero[Right] ;
            else
                B[j][1] = sumOfZero[Right] - sumOfZero[Left-1];

            if (Left == 0)
                B[j][0] = prefix[Right];
            else
                B[j][0] = prefix[Right] ^ prefix[Left - 1];
        }
        return B;
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int alen = A.size();
        int blen = B.size();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        ArrayList<Integer> oc = new ArrayList<>();

        oc.add(0,A.get(0));
        for(int i = 1 ; i < alen ; i++) {
            oc.add(i,oc.get(i-1) + A.get(i));
        }
        for(int i = 0 ; i < blen ; i++) {
            int frm = B.get(i).get(0)-1;
            int to = B.get(i).get(0)-1;

            int totalElement = to-frm+1;
            int oneCountInLtoR = (frm==0)?oc.get(to):oc.get(to)-oc.get(frm-1);
            int zeroCountInLtoR = totalElement - oneCountInLtoR;
            temp.add(0,((oneCountInLtoR&1) == 1)?1:0);
            ret.add(i,temp);
            temp.add(1,zeroCountInLtoR);
            ret.add(i, temp);
        }

        return ret;
    }
}
