package LeetCodeDailyProblem.DailyStudyPlan.Nov22StudyPlan;

public class IndexOfString {

    public static void main(String[] args) {
        String s = "asadbutsad";
        String p = "sad";
        System.out.println(indexOfString(s,p));
    }

    private static int indexOfString(String s, String p) {

        if(p.length() >s.length()) return -1;

        int i =0;
        int j = p.length()-1;

        while(j<s.length()){
            String substring = s.substring(i, j + 1);
            if(substring.equals(p)) return i;
            i++;
            j++;
        }
        return -1;
    }
}
