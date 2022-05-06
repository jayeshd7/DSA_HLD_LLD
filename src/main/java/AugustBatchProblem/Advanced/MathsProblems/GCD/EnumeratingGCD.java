package AugustBatchProblem.Advanced.MathsProblems.GCD;

/*
You are given a number A and a number B. Greatest Common Divisor (GCD) of all numbers between A and B inclusive is taken (GCD(A, A+1, A+2 ... B)).

As this problem looks a bit easy, it is given that numbers A and B can be in the range of 10100.

You have to return the value of GCD found.

Greatest common divisor of 2 numbers A and B is the largest number D that divides both A and B perfectly.
 */

public class EnumeratingGCD {

    public static void main(String[] args) {
        String A = "3";
        String B = "3";
        System.out.println(enumeratingGCDSolve(A,B));
    }

    private static String enumeratingGCDSolve(String A, String B) {

        if(A.equals(B)) return A;
        else return "1";

    }
}
