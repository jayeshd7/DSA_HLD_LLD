package AugustBatchProblem.swiggyPast;

public class ReverseStringLogic {

    public static void main(String[] args) {
        String s = "my name is jayesh dalal";
        int n = s.length();
        System.out.println(reverseSentence(s, n));

    }

    public static String reverseSentence(String s, int n ){
        String ans = "";
       if(n >=1) {
           char c = s.charAt(n - 1);
           ans = c + reverseSentence(s.substring(0,n-1), n-1);

       }

        return ans;
    }


}
