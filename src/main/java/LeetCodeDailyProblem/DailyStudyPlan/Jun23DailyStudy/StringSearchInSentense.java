package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class StringSearchInSentense {

    public static void main(String[] args) {

        String sentence = "i love eating burger";
        String searchWord = "ub";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    private static boolean isPrefixOfWord(String sentence, String searchWord) {
        if(sentence.toLowerCase().contains(searchWord)){
            return true;
        }else {
            return false;
        }
    }

}
