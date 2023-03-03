package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class FindTheIndexOfTheFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sadu";
        System.out.println(strStr(haystack, needle));
    }

    private static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        int i = 0;
        int j = 0;
        while(i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                i = i - j + 1;
                j = 0;
            }
        }
        if(j == needle.length()){
            return i - j;
        }
        return -1;

    }
}
