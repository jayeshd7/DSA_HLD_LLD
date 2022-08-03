package AugustBatchProblem.Day1;

public class longestPalindrome {

    public static void main(String[] args) {
        String s = "babad";

        if(s.length()<2){
            System.out.println(s);
        }
        String max = "";
        for(int i =0; i<s.length();i++){
            String odd = findPalindrome(s,i,i);
            String even = findPalindrome(s,i,i+1);
            if(odd.length() >max.length()){
                max = odd;
            }
            if(even.length() >max.length()) max = even;

        }
        System.out.println(max);
    }

    private static String findPalindrome(String s, int left, int right) {
    while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
        left --;
        right ++;
    }
        return s.substring(left+1,right);
    }
}
