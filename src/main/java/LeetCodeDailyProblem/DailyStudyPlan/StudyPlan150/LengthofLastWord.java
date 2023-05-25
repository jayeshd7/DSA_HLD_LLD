package LeetCodeDailyProblem.DailyStudyPlan.StudyPlan150;

public class LengthofLastWord {

    public static void main(String[] args) {
        String s = "hello World";

        String [] str = s.split(" ");
        int  lastStringIndex = str.length-1;
        String lastStringValue = str[lastStringIndex];


        System.out.println(lastStringValue.length());



        }
}
