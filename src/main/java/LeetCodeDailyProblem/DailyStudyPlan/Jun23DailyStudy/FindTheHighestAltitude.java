package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int [] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(findTheHighestAltitude(gain));
    }

    private static int findTheHighestAltitude(int[] gain) {
        int len = gain.length;
        int [] altitudes = new int[len + 1];
        altitudes[0] = 0;
        for(int i = 1; i <= len; i++){
            altitudes[i] = altitudes[i - 1] + gain[i - 1];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= len; i++){
            if(altitudes[i] > max){
                max = altitudes[i];
            }
        }
        return max;
    }
}
