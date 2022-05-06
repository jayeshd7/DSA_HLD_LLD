package AugustBatchProblem.Recursion;

public class MergeSort {

    public static void main(String[] args) {
        int [] A = {4,1,3,2,0,-1,7,10,9,20};
        int start = 0;
        int end = A.length -1;
        solve(A, start, end);
    }

    private static void solve(int []A, int start, int end) {

        if(start<end){
            int mid = (start + end)/2 ;
            solve(A, start, mid);
            solve(A, mid+1,end);
            merge (A, start, mid, end);

        }

    }

    private static void merge(int[] A, int start,int mid, int end) {
        int [] temp = new int [end -start +1];
        int i = start , j = mid+1, k=0;

        while (i<=mid && j<=end){
            if(A[i]<= A[j]){
                temp[k] = A[i];
                k++;i++;
            }
        }
        while (i<=mid){
            temp[k]= A[i];
            k++; i++;
        }
        while (i<=end){
            temp[k] = A[j];
            k++;j++;
        }
        for(i = start;i<=end;i++){
            A[i] = temp[i-start];
        }

    }
}
