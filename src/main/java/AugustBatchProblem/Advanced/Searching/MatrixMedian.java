package AugustBatchProblem.Advanced.Searching;

public class MatrixMedian {

    public static void main(String[] args) {
        int [][] A = {{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(matrixMedian(A));

    }
    static int matrixMedian(int [][] A){

        int n = A.length;
        int m = A[0].length;
        int l = 1;
        int r = (int)1e9;


        while (l<=r){
            int mid = l + (r-l)/2;
            int cnt = 0;

            for(int i =0; i<n;i++){
                cnt = cnt  + countSmallerThanEqualToMid(A[i], mid);
            }

            if( cnt <= (n*m)/2){
                l = mid +1;
            }else {
                r = mid-1;
            }

        }
        return l;
    }

    private static int countSmallerThanEqualToMid(int[] arr, int mid) {
        int l =0;
        int r = arr.length-1;

        while (l<=r){
            int md = l + (r-l)/2 ;
            if(arr[md] <= mid){
                l = md +1;
            }else { r = md-1;}
        }
        return l;
    }
}
