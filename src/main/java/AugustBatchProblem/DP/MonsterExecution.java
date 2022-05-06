package AugustBatchProblem.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MonsterExecution {

    public static void main(String[] args) {
        System.out.println(solveMosnster(811251));
    }

    private static int solveMosnster(int A) {
        LinkedList<Integer>al = new LinkedList<>();
        for(int i =1; i<A+1;i++){
            al.add(i);
        }


        rotate(al,al.size()-1);
        return al.get(0);


    }


    public static void rotate(LinkedList linkedlist, int n) {
        for (int i=0; i<n; i++) {
            Object item = linkedlist.removeLast();
            Object second = linkedlist.removeLast();
            linkedlist.addFirst(second);
        }
    }

    private static int[] chainMosnster(int[] B, int A) {
        int x = B[A-2];
        int [] c = new int[A];
        for(int j=A-1;j>0;j--){
            B[j]=B[j-1];

        }
        B[0]=x;
        return B;
    }

}
