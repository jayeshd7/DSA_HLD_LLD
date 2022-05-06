package AugustBatchProblem.Advanced.Searching;



public class SortTheArray {

    public static void main(String[] args) {
        int [] A = {5,6,6,3};
        int B = 7;
        int C= 1 ;
        System.out.println(solveSortTheArray(A, B, C));
    }

    private static int solveSortTheArray(int [] A, int B, int C) {

        int l = 0;
        int r = B;
        int ans = 0;


        while(l <=r){
            int mid = l + (r-l)/2;
            if(check(mid, A, B, C)){
                r = mid -1;
                ans = mid;
            }
            else l = mid + 1;
        }
        return ans;
    }

    private static boolean check(int mid, int [] A, int B, int C) {
        int n = A.length;
        int last = 0;

        for(int i = 0; i<n;i++){
            if(A[i]>last) {
                if((Math.ceil((double)(B-A[i]+ last)/C)) > mid){
                        last = A[i];
                }

            } else {
                if((Math.ceil((double) last -A[i])/C) >mid){
                    return false;
                }

            }
        }


        return true;
    }
}
