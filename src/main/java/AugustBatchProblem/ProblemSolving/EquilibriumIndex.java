package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class EquilibriumIndex {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-7);al.add(1);al.add(5);al.add(2);al.add(-4);al.add(3);al.add(0);
        System.out.println(solve(al));
    }
    public static int solve(ArrayList<Integer> A) {

        int ls = 0;
        int rs = 0;
        for(int i = 0; i<A.size();i++){
            rs += A.get(i);
        }

        for(int i =0;i<A.size();i++){
            rs = rs -A.get(i);
            if(ls == rs){
                return i;
            }
            ls = ls +A.get(i);
        }
        return -1;
    }
}
