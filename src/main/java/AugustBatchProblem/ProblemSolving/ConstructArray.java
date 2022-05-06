package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class ConstructArray {

    public static void main(String[] args) {
        int A = 5; int B = 20; int C= 50;
        solve(A,B,C);

        //d = C-B
            // a+d, a+2d
        // 50-20 = 30

        // 1 to 30

        // 10 20 30 40 50
        // 20, 30, 40, 50, 60
        // 20 50 80 110 140

        // 50, 60 140



        //  a, d ?
        // 10 20 30 40 50
        // 20 50 80 110 140
        //


    }

    public static ArrayList<Integer> solve(final int A, final int B, final int C) {

        int max_value = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int m =0;m<A;m++){
            ans.add(max_value);
        }

        //[10,20,30,40,50]
        //[ 10, 20,30,40,50]

        for(int i =1;i<=B;i++){
            for(int d =1;d<=C-B;d++){
                ArrayList<Integer>x = new ArrayList<>();
                for(int j =0;j<A;j++){
                    x.add(i+d*j);
                }

                if(x.contains(B) && x.contains(C) && ans.get(A-1)>x.get(A-1)){
                    for(int k =0; k<A;k++){
                        ans.set(k,x.get(k));
                    }
                }

            }
        }


        System.out.println(ans);
        return ans;
    }
}
