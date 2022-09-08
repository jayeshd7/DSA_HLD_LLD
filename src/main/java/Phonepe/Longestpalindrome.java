package Phonepe;

public class Longestpalindrome {
    public static void main(String[] args) {
        String s = "bbbaabbbaa";
        System.out.println(longestPalindromeSolve(s));
    }

    private static String longestPalindromeSolve(String s) {
        int mid;

        int n = s.length();
        if(n/2 != 0) {
            mid = n / 2;
        }
        else {
            mid = (n/2 +1);
        }
        String ans = String.valueOf(s.charAt(mid));
        int i=mid-1 ; int j = mid+1;
        while(i>=0 && j<n){
            if(s.charAt(i) == s.charAt(j)){
                ans = String.valueOf(s.charAt(i))+ans +String.valueOf(s.charAt(j));
            }
            i--;
            j++;

        }


        return ans;
    }
}

// second approach
/*
 if(S.length() < 2){
        return S;
        }
        String max="";
        for(int i=0; i<S.length()-1; i++){
        String odd = findPalindrome(S, i, i);  //odd length plaindrome
        String even = findPalindrome(S, i, i+1);  //even length plaindrome
        if (odd.length() > max.length()) {
        max = odd;
        }
        if (even.length() > max.length()) {
        max = even;
        }
        }
        return max;
        }

private String findPalindrome(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
        left--; right++;
        }
        return s.substring(left+1, right);
        }

*/