package AugustBatchProblem.DailyCodingProblem;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initialBankBalance = sc.nextInt();

        int addAmount = sc.nextInt();

        int totalAmount = add(initialBankBalance, addAmount);
        System.out.println(totalAmount);

        int substractAmount = sc.nextInt();
        int afterSecondsubtractAmount = substractAmount(totalAmount, substractAmount);

        int secondSubstractAmount = sc.nextInt();



    }

    private static int  substractAmount(int totalAmount, int subtractAmount) {
        int remainingAmount ;
        if( totalAmount < subtractAmount){
            System.out.println("InSufficient Balance");

        }
        else {
            remainingAmount = (totalAmount - subtractAmount);
            return remainingAmount;
        }
        return -1;

    }

    private static int add(int initialBankBalance, int addAmount) {
        return initialBankBalance + addAmount;

    }

}




