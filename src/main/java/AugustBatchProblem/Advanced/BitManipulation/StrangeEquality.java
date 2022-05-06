package AugustBatchProblem.Advanced.BitManipulation;
/*
Problem Description

Given an integer A.
Two numbers X and Y are defined as follows:

    X is the greatest number smaller than A such that XOR sum of X and A is the same as the sum of X and A.
    Y is the smallest number greater than A such that XOR sum of Y and A is the same as the sum of Y and A.

Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.



Problem Constraints

1 <= A <= 109


Input Format

First and only argument is an integer A.


Output Format

Return an integer denoting the XOR of X and Y.


Example Input

A = 5



Example Output

10



Example Explanation

The value of X will be 2 and the value of Y will be 8. The XOR of 2 and 8 is 10.
 */
public class StrangeEquality {

    /*
    Logic is
    (A+B) = A^B + 2(A&B)
    A= 2
    B = 8

    10 = 2^8 + 2(2&8)
    10 = 6 + 2(2)
    10 = 10


     */
    public static void main(String[] args) {
        System.out.println(StrangeEqualitySolve(5));
    }

    private static int StrangeEqualitySolve(int A) {
       int i = countBits(A);
       int y = (1<<i);

        String str = Integer.toBinaryString(A);
        int len = str.length();
        String str1 = "";
        for(int k = 0 ; k < len ; k++)
        {
            if(str.charAt(k) == '0')
                str1 = str1 + '1';
            else
                str1 = str1 + '0';
        }
        int x = Integer.parseInt(str1,2);
        return x ^  y;




    }
        static int countBits(int n)
        {
            int count = 0;
            while (n != 0)
            {
                count++;
                n >>= 1;
            }

            return count;
        }

}
