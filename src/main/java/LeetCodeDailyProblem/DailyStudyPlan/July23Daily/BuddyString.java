package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

public class BuddyString {

    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        System.out.println(buddyString(a, b));
    }

    private static boolean buddyString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return (second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first));
        }
        return false;
    }
}
