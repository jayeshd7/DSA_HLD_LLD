package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }
        if (sum == 1) {
            return true;
        } else if (sum == 4) {
            return false;
        }
        return isHappy(sum);
    }




}
