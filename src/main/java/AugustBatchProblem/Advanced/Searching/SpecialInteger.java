package AugustBatchProblem.Advanced.Searching;

public class SpecialInteger {

    public static void main(String[] args) {
        int [] A = {5, 17, 100, 11};
        int B = 130;
        System.out.println(solveSpecialInteger(A, B));
    }

    private static int solveSpecialInteger(int [] A, int B) {
        int n = A.length;
        int low = 0;
        int high = n;
        int ans = 1;
        while(low<=high)
        {

            int mid = low + (high - low)/2;
            int sum = 0;
            for(int i = 0; i<mid;i++){
                sum += A[i];
                if(sum > B){
                    break;
                }
            }
            if(sum <=B){
                for(int j = mid ; j<n;j++){
                    sum = sum - A[j-mid];
                    sum = sum + A[j];
                    if(sum >B){
                        break;
                    }
                }
            }
            if(sum >= B){

                high = mid -1;
            }
            else {
                ans = mid;
                low = mid +1;}
        }
        return ans;
    }
}
