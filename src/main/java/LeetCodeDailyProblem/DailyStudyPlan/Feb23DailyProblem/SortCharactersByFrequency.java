package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        StringBuilder[] bucket = new StringBuilder[s.length() + 1];
        for (int i = 0; i < count.length; i++) {
            int frequency = count[i];
            if (frequency > 0) {
                if (bucket[frequency] == null) {
                    bucket[frequency] = new StringBuilder();
                }
                for (int j = 0; j < frequency; j++) {
                    bucket[frequency].append((char) i);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                result.append(bucket[i]);
            }
        }
        return result.toString();
    }
}
