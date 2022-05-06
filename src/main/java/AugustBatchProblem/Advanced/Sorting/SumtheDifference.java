package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;

public class SumtheDifference {
    public static int MOD = 1000000007;
    public static void main(String[] args) {
        int [] A = {1,2,3};
        System.out.println(solveSumtheDifference(A));

    }
    public static  int solveSumtheDifference(int [] A){

        int n = A.length;
        Arrays.sort(A);
        long max = 0; long min = 0;

        for(int i = 0; i<n;i++){
            max = 2*max+ A[n-i-1];
            max = max%MOD;
            min = 2*min + A[i];
            min = min%MOD;

        }
        return (int) ((max-min+MOD)%MOD);

    }
}
