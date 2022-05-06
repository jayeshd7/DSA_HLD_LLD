package AugustBatchProblem.ArrayProblems;

public class RemoveDuplicateWithSignleArray {

    public static void main(String[] args) {
        int [] A = {1,1,2,2,2,3,4};
        System.out.println(solve(A));
    }

    private static int solve(int [] A) {
        if(A.length == 1){
            return A[0];
        }
        int res = 1;
        for(int i =1 ;i <A.length;i++){
            if(A[i] != A[res-1]){
                A[res] = A[i];
                res++;
            }
        }
        for(int j =0;j<res;j++){
            System.out.println(A[j]);
        }
        return res;

    }
}
