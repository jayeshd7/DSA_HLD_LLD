package AugustBatchProblem.Day1;

import java.util.ArrayList;

public class TwoGreaterNumber {
    public static void main(String[] args) {
        ArrayList A = new ArrayList<Integer>();
        A.add(0,1);
        A.add(1,2);
        A.add(2,3);
        A.add(3, 4);
        A.add(4,5);
        solve(A);

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        int firstGreatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            if(A.get(i) > firstGreatest){
                secondGreatest = firstGreatest;
                firstGreatest = A.get(i);
            }
            else if(A.get(i) > secondGreatest){
                secondGreatest = A.get(i);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            if(A.get(i) != secondGreatest && A.get(i) != firstGreatest){
                res.add(A.get(i));
            }
        }
        System.out.println(res);
        return res;
    }
}

