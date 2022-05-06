package AugustBatchProblem.ProblemSolving;

public class SquareGranites {
    public static void main(String[] args) {
        System.out.println(solve(6,6,4));

    }
    public static int solve(int A, int B, int C) {
        int i = A/C;
        int j = B/C;
        if(i*C != A){
            i++;
        }
        if(j*C != B){
            j++;
        }
        return i * j;
    }
}
