package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class PrimalPower {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(10);
        al.add(3);

        solve(al);

    }
    public static int solve(ArrayList<Integer> A) {

        int count = 0;
        for (int i : A) {
            if(i > 1){
            if (isPrime(i)) {
                count += 1;
            }
            }
        }
        System.out.println(count);
        return count;
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i < (int) Math.sqrt(number); i++) {
            if(number % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}
