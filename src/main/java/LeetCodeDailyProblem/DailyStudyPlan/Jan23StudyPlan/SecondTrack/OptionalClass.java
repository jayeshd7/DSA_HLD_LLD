package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        String[] words = new String[5];
        Optional<String> checkNull = Optional.ofNullable(words[1]);
        if(checkNull.isPresent())
        {
            String word= words[1].toLowerCase();
            System.out.println(word);
        }
        else
        {
            System.out.println( "word is null");
        }

    }
}
