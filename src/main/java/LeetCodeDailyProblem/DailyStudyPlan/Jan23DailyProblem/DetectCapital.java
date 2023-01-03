package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        return count == word.length() || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
