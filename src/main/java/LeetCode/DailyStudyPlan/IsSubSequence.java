package LeetCode.DailyStudyPlan;

public class IsSubSequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }

    private static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == n;
    }
}
