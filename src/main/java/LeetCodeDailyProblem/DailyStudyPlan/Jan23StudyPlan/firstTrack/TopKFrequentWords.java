package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.firstTrack;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;

        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        List<String> result = topKFrequentWords.topKFrequent(words, k);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private List<String> topKFrequent(String[] words, int k) {
        List<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> que = new PriorityQueue<>((a, b) -> Objects.equals(a.getValue(), b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        que.addAll(map.entrySet());
        while (k-- > 0) {
            arr.add(Objects.requireNonNull(que.poll()).getKey());
        }
        return arr;
    }

}
