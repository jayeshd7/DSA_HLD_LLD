package AugustBatchProblem.Advanced.BitManipulation;

/*
Problem Description

Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints

-231 <= A, B <= 231-1

B!= 0



Input Format

First argument is an integer A denoting the dividend.
Second argument is an integer B denoting the divisor.


Output Format

Return an integer denoting the floor value of the division.


Example Input

Input 1:

 A = 5
 B = 2

Input 2:

 A = 7
 B = 1



Example Output

Output 1:

 2

Output 2:

 7
 */
public class DivideInteger {

    public static void main(String[] args) {
        System.out.println(divide(5,2));

    }
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;
        if (divisor == 2) return (dividend >> 1);

        return (int) res(dividend, divisor);
    }

    private static long res(long dividend, long divisor) {
        boolean sign = false;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = true;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = (int) Math.floor(Math.exp(Math.log(dividend) - Math.log(divisor)));
        return sign ? -result : result;
    }
}
