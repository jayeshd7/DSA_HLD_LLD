package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;



public class PalindromeSubString {

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(palindromeSubstring(s));
    }

    private static int palindromeSubstring(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0; i<n;i++){
            for(int j =i;j<n;j++){
                if(isPalindromeCheck(s,i,j)) ans++;
            }
        }
        return ans;
    }

    private static boolean isPalindromeCheck(String s, int left, int right) {
        while(left<right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
