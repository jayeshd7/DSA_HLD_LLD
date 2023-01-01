package LeetCode.DailyStudyPlan.Jan23DailyProblem;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String word = "dog cat cat dog";
        System.out.println(wordPattern(pattern, word));
    }

    private static boolean wordPattern(String pattern, String s) {
        Map h1 = new HashMap<Character, String>();
        Map h2 = new HashMap<String, Character>();

        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        for (int i=0;i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (h1.containsKey(ch))
                if (!h1.get(ch).equals(words[i]))
                    return false;
            h1.put(ch, words[i]);

            if (h2.containsKey(words[i]))
                if (!h2.get(words[i]).equals(ch))
                    return false;
            h2.put(words[i], ch);

        }

        return true;
    }
}
