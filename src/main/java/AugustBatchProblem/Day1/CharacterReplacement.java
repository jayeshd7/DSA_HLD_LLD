package AugustBatchProblem.Day1;

public class CharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA"; int k = 1;
        int [] freq = new int [26];
        int left = 0; int ans = 0; int maxFreq = 0;

        for(int right = 0; right <s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int letterToChange = (right-left+1)- maxFreq;
            if(letterToChange >k){
                freq[s.charAt(right)-'A']--;
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        System.out.println(ans);
    }
}
