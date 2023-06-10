package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println(findSmallestLetterGreaterThanTarget(letters, target));
    }

    private static char findSmallestLetterGreaterThanTarget(char[] letters, char target) {
       int left = 0;
       int right = letters.length - 1;

       while (left <= right) {
           int mid = left + (right - left) / 2;
           if (letters[mid] <= target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return left < letters.length ? letters[left] : letters[0];
    }
}
