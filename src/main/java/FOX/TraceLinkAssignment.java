package FOX;

import java.util.HashMap;

public class TraceLinkAssignment {

    public static void main(String[] args) {
        double[] binaryNumber = {10101, 102345,001100, 101010100};
        validBinaryNumber(binaryNumber);
    }

    private static void validBinaryNumber(double[] binaryNumber) {
        HashMap<Double, Boolean> map = new HashMap<>();
        for (int i = 0; i < binaryNumber.length; i++) {
            if (!checkIfBinary(binaryNumber[i])) {
                map.put(binaryNumber[i], false);
            }
            map.put(binaryNumber[i], true);
        }
        System.out.println(map);

    }

    private static boolean checkIfBinary(double binaryNumber) {
        int copyOfInput = (int) binaryNumber;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }
}
