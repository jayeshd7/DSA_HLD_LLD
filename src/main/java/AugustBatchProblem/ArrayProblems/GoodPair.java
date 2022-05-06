package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class GoodPair {



    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        int B = 7;
        goodPair(al, B);
    }

    private static int goodPair(ArrayList<Integer> A, int B) {

        for(int i =0;i<= A.size()-1;i++){
            for(int j =i+1;j<=A.size()-1 ;j++){
                if(A.get(i) + A.get(j) == B){
                    return 1;
                }
            }


        }

        return 0;

    }
}
