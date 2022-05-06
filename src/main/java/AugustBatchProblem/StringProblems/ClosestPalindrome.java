package AugustBatchProblem.StringProblems;


public class ClosestPalindrome {

    public static void main(String[] args) {
        String ans =solve("cddfeffe");
        System.out.println(ans);



    }
    public static String solve(String A) {
        int i =0, j =A.length()-1;
        int count = 0;

       while(i<j){

            if(A.charAt(i) != A.charAt(j)){
                if(count == 1) return "NO";
                count++;
            }
            i++;j--;
       }
       if(A.length() % 2 == 0 && count == 0){
           return "NO";
       }
        if(A.length() % 2 != 0 && count == 0){
            return "YES";
        }
        if(count ==1) return "YES";


        return "NO";


    }
}
