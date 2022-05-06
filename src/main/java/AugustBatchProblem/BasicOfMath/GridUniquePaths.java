package AugustBatchProblem.BasicOfMath;

public class GridUniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
    public static double nCr(int n, int r){
        double f = 1;
        double p = 2;
        for(int  i = n ; i > r; i--){
            f *= i;
            if(p<=(n-r)){
                f /= p;
                p++;
            }
        }
        return f;
    }
    public static int uniquePaths(int A, int B) {
        if(A == 1 || B == 1) return 1;
        int n = (A-1)+(B-1);
        int r = A-1;
        if(B>A){
            r = (B-1);
        }
        return (int)nCr(n, r);
    }
}
