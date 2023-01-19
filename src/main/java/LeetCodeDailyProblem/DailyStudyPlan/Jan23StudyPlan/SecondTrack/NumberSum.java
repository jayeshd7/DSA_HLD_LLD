package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class NumberSum {
    public static void main(String[] args) {
        int a = 191;
        int ans = numberSumTillSingleDigit(a);
        System.out.println(ans);
    }

    private static int numberSumTillSingleDigit(int a) {
        int sum = 0;
        while(a > 0)
        {
            sum += a % 10;
            a /= 10;
        }
        if(sum > 9)
        {
            return numberSumTillSingleDigit(sum);
        }
        return sum;

    }


}
