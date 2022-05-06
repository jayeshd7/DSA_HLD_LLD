package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

public class FindingPosition {

    public static void main(String[] args) {
        normalSolution(10);
        efficientSolution(10);
    }

    private static int efficientSolution(int n) {

        int res = 0;
        for(int i =n ;i>=1 ;i--){
            if((i & (i-1)) == 0){
                res = i;
                break;
            }
        }
        return  res;
    }

    private static int normalSolution(int n) {
        int p = (int)(Math.log(n) /
                Math.log(2));
        return (int)Math.pow(2, p);
    }
}
