package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ConcatenatedWords {
    public static void main(String[] args) {
        String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        List<String> allConcatenatedWordsInADict = findAllConcatenatedWordsInADict(words);
        System.out.println(allConcatenatedWordsInADict);
    }

    private static List<String> findAllConcatenatedWordsInADict(String[] words) {
       List<String> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String word: words){
            set.add(word);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String i: words){
            if(dfsAllConcatenatedWordsInADict(i,set,map)){
                ans.add(i);
            }
        }
        return ans;

    }

    private static boolean dfsAllConcatenatedWordsInADict(String i, HashSet<String> set, HashMap<String, Integer> map) {
        if(map.containsKey(i)){
            return map.get(i)==1;
        }
        for(int j = 1; j<i.length();j++){
            String left = i.substring(0,j);
            String right = i.substring(j);
            if(set.contains(left)){
                if(set.contains(right)||dfsAllConcatenatedWordsInADict(right,set,map)){
                    map.put(i,1);
                    return true;
                }
            }
        }
        map.put(i,0);
        return false;
    }
}
