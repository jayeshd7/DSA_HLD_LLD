package AugustBatchProblem.Revision;

public class MinimumPicks {

    public static void main(String[] args) {
        int [] A = {5, 17, 100, 1};
        System.out.println(solveMinimumPicks(A));
    }
    static int solveMinimumPicks(int [] A){
        int n = A.length;
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;

        for(int i =0; i<n;i++){
            if( A[i] <min_value && A[i] % 2 != 0){
                min_value = A[i];

            }
        }
        for(int i =0; i<n;i++){
            if(A[i] >max_value && A[i] % 2 == 0){
                max_value= A[i];
            }
        }
        return max_value-min_value;
    }
}
