package AugustBatchProblem.Advanced.BitManipulation;

public class InterestingArray {

    public static void main(String[] args) {
        int [] A = {9,17};
        System.out.println(interestingArraySolve(A));
    }

    private static String interestingArraySolve(int [] A) {
        int n = A.length;
        int ctrl = 0;
        for(int i =0; i<n;i++){
            if(A[i] % 2 == 1){
                ctrl++;
            }
        }
        if(ctrl % 2 == 1){
            return "NO";
        }
        else { return "YES";}
    }
}
