package AugustBatchProblem.Day2;

import java.util.ArrayList;
import java.util.List;

public class findTwoOddNumber {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<Integer>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(4);

        TwoOddNumber(al);

    }

    private static int TwoOddNumber(final List<Integer> A) {
        int xor = 0 , res1 =0,  res2 = 0;

        for(int i =0 ; i< A.size();i++){
            xor = xor ^ A.get(i);
        }
        int sn = xor & ~(xor -1); // find Right most set bit { awesome concept}

        for(int i = 0; i< A.size();i++){
            if((A.get(i) & sn) != 0){
                res1 = res1 ^ A.get(i);
            }else{
                res2 = res2 ^ A.get(i);
            }
        }
        System.out.println("ans :" +res1 + "&" + res2);
        return xor;
    }



}
