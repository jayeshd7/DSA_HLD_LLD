package AugustBatchProblem.Recursion;



public class PrintNumbers {
    public static void main(String[] args) {
        solve(100);
        oppositeSolve(100);
    }


    private static void solve(int i) {
        if(i > 0)
        {
            solve(i - 1);
            System.out.print(i + " ");
        }


    }

    private static void oppositeSolve(int i) {
        if(i>0){
            System.out.println( i+ "");
            oppositeSolve(i-1);
        }
    }

}
