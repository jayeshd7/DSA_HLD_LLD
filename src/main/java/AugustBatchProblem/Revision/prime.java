package AugustBatchProblem.Revision;

public class prime {


    public static void main(String[] args) {
        int [] A = {-2,-3,7,6,5,11};
        solve(A);
    }
    public static int solve(int[] A) {


        int count = 0;
        for (int i : A) {
            if(i > 0){
                if (isPrime(i)) {
                    count += 1;
                }
            }
        }
        return count ;
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}


