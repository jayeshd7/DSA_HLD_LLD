package AugustBatchProblem.games24;

public class findSumAlphaNumeric {


    public static void main(String[] args) {
        String s = "playgames24x7@360";

        System.out.println(findSumAlphaNumericSolution(s));
    }

    private static int findSumAlphaNumericSolution(String str) {


        int size = str.length();
        int sum = 0;
        String temp = "0";

        for(int i =0; i<size;i++) {

            if (Character.isDigit(str.charAt(i))) {
                String value1 = String.valueOf(str.charAt(i));
                temp = temp + value1;
            }
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }

        }

        return sum + Integer.parseInt(temp);
    }
}
