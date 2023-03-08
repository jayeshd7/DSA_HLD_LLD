package Top50DSASDET;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babacd";
        System.out.println(solLongestPalindrome(s));
    }

    private static String solLongestPalindrome(String s) {
        if(s.length() == 0) return "";
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            int len1 = expandFromMid(s,i,i);
            int len2 = expandFromMid(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - ((len-1)/2);
                end = i + (len/2);
            }
        }
        return s.substring(start,end+1);
    }

    private static int expandFromMid(String s, int left, int right) {
        if(s == null || left > right){
            return 0;
        }
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;

    }
}
