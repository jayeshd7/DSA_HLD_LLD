package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    private static int characterReplacement(String s, int k) {
        int[] freqs = new int[26];
        int left = 0, ans = 0, maxFreq = 0;

        for(int right = 0; right < s.length(); right++){
            freqs[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, freqs[s.charAt(right)-'A']);

            int lettersToChange = (right - left + 1) - maxFreq;
            if(lettersToChange > k){
                freqs[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
