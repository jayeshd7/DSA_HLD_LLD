package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class AddOneToNumber {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //A.add(0);
        A.add(9);
        A.add(9);
        A.add(9);

        plusOne(A);
    }
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int reminder = 0;
        while (A.size() > 1 && A.get(0) == 0) {
            A.remove(0);
        }
        for (int i = A.size() - 1; i >= 0; i--) {
            int num = A.get(i);
            if(num == 9){
                A.remove(i);
                A.add(i,0);
                reminder = 1;
            }else{
                A.remove(i);
                A.add(i,num+1);
                reminder = 0;
                break;
            }
        }
        if(reminder == 1){
            A.add(0,1);
        }

        System.out.println(A);
        return A;
    }
}
