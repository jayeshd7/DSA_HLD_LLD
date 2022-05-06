package AugustBatchProblem.StringProblems;

public class AmazingSubString {

    public static void main(String[] args) {
        int ans = solve("ABEC");
        System.out.println(ans);
    }

    public static int solve(String A) {
        //approch -1
       /* String vow = "aeiouAEIOU";
        int count = 0;
        int s = A.length();
        for(int i=0; i<A.length(); i++){
            if(vow.indexOf(A.charAt(i)) >= 0){
                count += s-i;
            }
        }
        return count % 10003;*/


        int c =  0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' ||
                    A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U' ){
                c = c + A.length()-i;
            }
        }
        return c%10003;
    }
}
