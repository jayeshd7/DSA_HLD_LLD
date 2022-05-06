package AugustBatchProblem.Recursion;

public class BinarySearchUsingRecusrion {

    public static void main(String[] args) {
        int A [] = {-1,0,1,2,3,4,5,6};
        int n = A.length;
        int x = 0;
        int left = A[0];
        int right = A[n-1];
        int ans =solve(A, left,right,x);
        System.out.println(ans);

    }

    private static int solve(int[] a, int left, int right, int x) {
        if(left > right){
            return -1;
        }
        int mid = (left +right) /2 ;
        if (x == a[mid]) return mid;
        if(x<a[mid]){
            return solve(a, left, mid-1,x);
        }
        return solve(a, mid+1, right,x);

    }
}
