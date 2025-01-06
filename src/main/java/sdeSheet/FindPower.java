package sdeSheet;

public class FindPower {

    public static void main(String[] args) {
        int x = 2;
        int n = -3;
        double ans = findPower(x, n);
        System.out.println("Power of x: " + ans);
    }

    private static double findPower(int x, int n) {
        if(n>0){
            return power(x, n);
        } else {
            return 1/power(x, n);
        }


    }

    private static double power(int x, int n) {
        double value = 1.0;
        for(int i=0;i<n;i++) {
            value = value * x;
        }
            return value;

    }
}
