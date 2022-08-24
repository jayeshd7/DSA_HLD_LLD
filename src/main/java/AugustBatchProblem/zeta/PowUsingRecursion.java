package AugustBatchProblem.zeta;

public class PowUsingRecursion {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(pow(3,4));
    }

    private static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        else {
            return (a * pow(a,b-1));
        }
    }
}
