package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class CircleOfMonsters {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(7);A.add(2);A.add(5);

        ArrayList<Integer>B = new ArrayList<>();
        B.add(15);B.add(14);B.add(3);
        System.out.println(solve(A,B));

    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int n = A.size();
        long ans = Long.MAX_VALUE;
        long sum = 0;


        // 4 , 0, 0  = 4

        // 4-4+7 = 7
        // 4+2+3 = 9
        //

        for(int i =0;i<n;i++){
            int cost = Math.max(0, A.get(i)-B.get((n+i-1)%n));
            sum = sum + cost;
        }
        for(int j =0;j<n;j++){
            int cost = Math.max(0, A.get(j)-B.get((n+j-1)%n));
            ans = Math.min(ans,sum-cost+A.get(j));

            // 4-4 + 7 = 7 - *
            // 4 - 0 + 2 = 6 - ans
            // 4- 0+ 5 = 9 - *


        }




        return (int) (ans % 1000000008);

    //current


    }
}
