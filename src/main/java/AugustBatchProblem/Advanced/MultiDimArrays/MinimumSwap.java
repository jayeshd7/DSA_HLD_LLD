package AugustBatchProblem.Advanced.MultiDimArrays;

import java.util.ArrayList;

public class MinimumSwap {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(5);A.add(7);A.add(100);A.add(11);
        int B = 20;
        System.out.println(solveMinimumSwap(A,B));
    }

    private static int solveMinimumSwap(ArrayList<Integer> A, int B) {

        int n = A.size();
        int count = 0;
        for(int i =0;i<n;i++){
            if(A.get(i)<=B){
                    count++;
            }
        }
        int bad = 0;
        for(int i =0;i<count;i++){
            if(A.get(i)>B){
                bad++;
            }
        }
        int ans = bad;
       for(int i =0, j=count;j<n;i++,j++){
                if(A.get(i)>B){
                    bad--;
                }
                if(A.get(j)>B){
                    bad++;
                }
                ans = Math.min(ans,bad);
        }
        return ans;
    }
}
