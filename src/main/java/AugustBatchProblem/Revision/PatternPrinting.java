package AugustBatchProblem.Revision;

import java.util.Arrays;

public class PatternPrinting {

    public static void main(String[] args) {
        int [] [] mat = solvePatternPrinting(3);
        for(int [] row:mat){
            System.out.println(Arrays.toString(row));
        }

    }

    private static int [][] solvePatternPrinting(int A) {

        int [][] ans = new int[A][A];
        for(int i = 0; i<A;i++){
            for (int j =0; j<=i;j++){
                ans[i][j] = j+1;
            }
        }
        return ans;

    }
}
