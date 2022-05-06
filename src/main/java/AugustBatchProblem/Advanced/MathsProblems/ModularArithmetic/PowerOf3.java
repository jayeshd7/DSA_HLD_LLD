package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

import java.util.ArrayList;

public class PowerOf3 {

    public static void main(String[] args) {
        System.out.println(powerOf3Solve(14));

        //[1+1+9]


    }

    private static ArrayList<Integer> powerOf3Solve(int num) {
        ArrayList<Integer>tenary = new ArrayList<>();
        ArrayList<Integer>x = new ArrayList<>();
        int id = 0;

        // Number should be positive
        while (num > 0) {
            tenary.add(id++,(num % 3) );
            num = num / 3;
        }
        //[1,1,1]
        //[1,3,9]
        for(int i =0;i<tenary.size();i++){
            int ans = (int)Math.pow(3,i);
            while(tenary.get(i)>0){
                x.add(ans);
                tenary.set(i, tenary.get(i)-1);
            }
            //x.add(ans);
        }


        return x;
    }

}
