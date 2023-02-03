package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!isSorted(words[i], words[i + 1], orderMap)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String word1, String word2, int[] orderMap) {
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            if (orderMap[word1.charAt(i) - 'a'] < orderMap[word2.charAt(j) - 'a']) {
                return true;
            } else if (orderMap[word1.charAt(i) - 'a'] > orderMap[word2.charAt(j) - 'a']) {
                return false;
            }
            i++;
            j++;
        }
        return i == word1.length();
    }
}
