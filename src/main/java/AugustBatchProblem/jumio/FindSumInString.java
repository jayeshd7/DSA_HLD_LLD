package AugustBatchProblem.jumio;

public class FindSumInString {

    public static void main(String[] args) {
        String str= "abc123fhf12";
        System.out.println(findSUmInStringSolve(str));
        //123

        //abc123
        //12, 23

        // 12+23+12+22+34+

        //123+12234+98
    }

    private static int findSUmInStringSolve(String str) {
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

//o(n)
