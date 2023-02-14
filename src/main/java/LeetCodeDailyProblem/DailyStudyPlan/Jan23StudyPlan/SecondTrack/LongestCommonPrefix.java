package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","f","flight"};
        System.out.println(longestCommonPrefix(strs));


    }

    private static String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        String start = strs[0];
        String end = strs[n-1];
        StringBuilder s = new StringBuilder();

        for(int i = 0; i<n;i++){
            if(start.charAt(i) == end.charAt(i)){
                s.append(start.charAt(i));
            }
            else {
                break;
            }
        }
        return s.toString();
    }
}
