package Revision;

public class SumTwoNumber {
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(111,222));
    }

    private static int sumTwoNumber(int param1, int param2) {
        int sum = 0;
        int carry = 0;
        int temp = 0;
        while (param1 != 0 || param2 != 0) {
            temp = param1 % 10 + param2 % 10 + carry;
            carry = temp / 10;
            sum = sum * 10 + temp % 10;
            param1 /= 10;
            param2 /= 10;
        }
        if (carry != 0) {
            sum = sum * 10 + carry;
        }
        return sum;
    }
}
