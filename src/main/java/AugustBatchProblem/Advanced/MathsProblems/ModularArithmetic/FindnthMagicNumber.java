package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

public class FindnthMagicNumber {

    public static void main(String[] args) {
        System.out.println(nthMagicNumbersolve(3));

    }

    private static int nthMagicNumbersolve(int A) {

        int ans = 0; int pow =1;
        while(A>0){
            pow = pow * 5;

            if( A %2 ==1){
                ans += pow ;
            }
            A = A/2;
        }
        return ans;
    }
}
