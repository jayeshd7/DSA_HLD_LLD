package AugustBatchProblem.Revision;

import java.util.Arrays;

public class ElementsAtLeastGreaterThanTwo {

    public static void main(String[] args) {
        int [] A = {1,2,3,5,4,6};
        int [] ans = solveElementsAtLeastGreaterThanTwo(A);
        for(int j = 0; j<ans.length;j++){
            System.out.println(ans[j]);
        }

    }
    static int [] solveElementsAtLeastGreaterThanTwo(int [] A){
        int n = A.length;
        int [] B = new int[n-2];
        Arrays.sort(A);

        for(int i = 0; i<n-2;i++ ){
            B[i]= A[i];
        }
        return B;
    }
}
