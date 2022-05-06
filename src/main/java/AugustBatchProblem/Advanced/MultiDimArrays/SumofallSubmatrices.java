package AugustBatchProblem.Advanced.MultiDimArrays;

public class SumofallSubmatrices {
    public static void main(String[] args) {

        int[][] A = {{1, 1}, {1, 1}};
        System.out.println(solveSum(A));

    }

    private static int solveSum(int[][] a) {
        int ans = 0;
        int n = a.length;
        int m = a[0].length;



       for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                ans += (i+1)*(j+1)*(n-i)*(m-j)*a[i][j];
            }
        }
      return ans;
    }
}
