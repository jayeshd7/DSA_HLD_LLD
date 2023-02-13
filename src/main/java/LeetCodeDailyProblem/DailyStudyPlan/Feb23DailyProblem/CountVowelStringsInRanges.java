package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class CountVowelStringsInRanges {
    public static void main(String[] args) {
        String [] words = {"aba","bcb","ece","aa","e"};
        int [][] queries = {{0,2},{1,4},{1,1}};

        int [] result = countVowelStrings(words, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    private static int[] countVowelStrings(String[] words, int[][] queries) {
            int[] isVowels = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) isVowels[i]++;
            }
            for (int i = 1; i < isVowels.length; i++) isVowels[i] += isVowels[i - 1];
            int[] ans = new int[queries.length];
            int index = 0;
            for (int[] query : queries) {
                int start = query[0], end = query[1];
                if (query[0] == 0) ans[index] = isVowels[end];
                else ans[index] = isVowels[end] - isVowels[start - 1];
                index++;
            }
            return ans;
        }

        public static boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

}
