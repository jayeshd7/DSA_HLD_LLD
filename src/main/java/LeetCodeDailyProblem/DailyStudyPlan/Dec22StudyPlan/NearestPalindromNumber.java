package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

public class NearestPalindromNumber {
    public static void main(String[] args) {
        System.out.println(nearestPalindromic(2147483647));
    }

    private static String nearestPalindromic(int n) {
        int rNum = n - 1;
        while (isPalindrome(Integer.toString(rNum)) == false) {
            rNum--;
        }
        int sNum = n + 1;
        while (isPalindrome(Integer.toString(sNum)) == false) {
            sNum++;
        }


        return (Math.abs(n - rNum) <= Math.abs(n - sNum)) ? Integer.toString(rNum) : Integer.toString(sNum);

    }

    private static boolean isPalindrome(String s) {

        int len = s.length();
        int left = 0;
        int right = len-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
