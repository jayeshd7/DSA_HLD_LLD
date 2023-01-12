package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.HashMap;

public class LongestPalindromeConcatenatingTwoLetterWords {
    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        System.out.println(longestPalindromeByConcatenatingTwoLetterWords(words));
    }

    private static int longestPalindromeByConcatenatingTwoLetterWords(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:words){
            if(map.containsKey(s)){
                map.replace(s,map.get(s)+1);
            }
            else map.put(s,1);
        }
        int len = 0;
        int count = 0;
        boolean flag = false;
        for(String s:map.keySet()){
            String str = new StringBuilder(s).reverse().toString();
            if(s.charAt(0)==s.charAt(1)){
                count = map.get(s);
                if(count%2!=0){
                    count--;
                    flag = true;
                }
                len+=count*2;
            }
            else if(s.charAt(0)!=s.charAt(1)&&map.containsKey(str)){
                len+=(Math.min(map.get(s),map.get(str)))*4;
                map.replace(s,0);

            }
        }
        if(flag)len+=2;
        return len;


    }
}
