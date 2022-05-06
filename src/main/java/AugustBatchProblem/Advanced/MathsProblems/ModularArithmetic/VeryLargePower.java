package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

public class VeryLargePower {

    public static void main(String[] args) {
        System.out.println(largePowerSolve(2,27));
    }

    private static int largePowerSolve(int A, int B) {

        long mod = 1000000007;

        if(A==0){
            return 0;
        }
        if(B==0){
            return 1;
        }

        long b = factorial(B) % mod;

        return (int) (Math.pow((A % mod),b) %mod);



    }
    static int factorial(int B)
    {
        long mod = 1000000007;
        return (B == 1 || B == 0) ? 1 : (int) (B * factorial((int) ((B - 1) % mod)));
    }



    public int solve(int A, int B) {

        if(A==0){
            return 0;
        }
        if(B==0){
            return 1;
        }

        long mod = 1000000007;

        long b = 1;

        for(int i = 2;i<=B;i++){
            b = (( b %(mod-1)) * (i %(mod-1))) % (mod-1);
        }

        long pow = b % mod ;
        long a = A % mod;
        long ans = 1;

        while (pow>0){
            if(pow %2 ==0){
                a = (a*a)%mod;
                pow = pow/2;
            }
            else{
                ans = (ans * a)% mod;
                a= (a*a)%mod;
                pow = (pow-1)/2;
            }
        }
        return (int) ans;


    }

}
