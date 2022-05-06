package AugustBatchProblem.Advanced.Arrays;

public class ClosetMinMax {

    public static void main(String[] args) {
        int [] A = {1, 3, 5, 2, 4, 3};
        System.out.println(solve(A));
    }

    private static int solve(int [] A) {
        int n = A.length;
        if(n == 1) return 1;


        int min_val = A[0];
        int max_val = A[0];


        for(int i =1;i<n;i++){
            if(A[i]<min_val){
                min_val = A[i];
            }
            else if(A[i]>max_val){
                max_val = A[i];
            }
        }
        int ans = Integer.MAX_VALUE;
        int min_index = -1;
        int max_index = -1;

        for(int i =0;i<n;i++){
            if(A[i] == min_val){
                min_index = i;
            }
            if(A[i] == max_val){
                max_index =i;
            }
            if(min_index != -1 && max_index != -1){
                ans = Math.min(ans, Math.abs(max_index-min_index)+1);
            }
        }

        return ans;
    }
}
