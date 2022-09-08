package AugustBatchProblem.Advanced;

public class RandomPhoneNumber {


    public static void main(String[] args) {
        int [] digits = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(generateNumber(digits, "abdsvds","basd"));


    }

    private static String generateNumber(int[] digits, String fn, String ln) {
        String mobileNumber = "";


        for(int i = 1; i<digits.length;i++){
            mobileNumber = mobileNumber + String.valueOf((digits[i] * fn.length())% ln.length());
        }
        return mobileNumber;

    }
}
