package AugustBatchProblem.Day1;

public class RevereseString {
    public static void main(String[] args) {
        String s= "jayesh";
        int len = s.length();
        for(int i = len-1;i>-1;i--){
            System.out.print(s.charAt(i));
        }
    }
}
