package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class FlipStringToMonotoneIncreasing {
    public static void main(String[] args) {
        String s = "00110";
        System.out.println(minFlipsMonoIncr(s));
    }

    private static int minFlipsMonoIncr(String s) {
        int i = 0;
        for(i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)=='1')
                break;
        }
        int countflips = 0;
        int countOnes = 0;
        for(; i < s.length(); i++)
        {
            if(s.charAt(i)=='0')
                countflips++;
            else
                countOnes++;
            countflips = Math.min(countflips, countOnes);
        }
        return countflips;
    }
}
