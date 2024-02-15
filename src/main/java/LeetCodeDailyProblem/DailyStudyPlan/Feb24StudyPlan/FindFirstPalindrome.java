package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

public class FindFirstPalindrome {
    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    private static String firstPalindrome(String[] words) {
        for(String word:words){
            if(isFirstPalindrome(word)){
                return word;
            }
        }
        return "";
    }

    private static boolean isFirstPalindrome(String word) {
        int i =  0;
        int j = word.length()-1;
        while(i<j){
            if(word.charAt(i++) != word.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
