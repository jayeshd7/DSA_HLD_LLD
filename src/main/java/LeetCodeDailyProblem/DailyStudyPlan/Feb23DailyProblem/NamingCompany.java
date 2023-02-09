package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

import java.util.HashSet;

public class NamingCompany {
    public static void main(String[] args) {
        String [] ideas ={"coffee","donuts","time","toffee"};
        System.out.println(distinctNames(ideas));
    }

    private static long distinctNames(String[] ideas) {
        HashSet<String>[] set = new HashSet[26];
        for (int i = 0; i < 26; i++) {
            set[i] = new HashSet<>();
        }
        for (String idea : ideas) {
            set[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        long ans = 0;
        for (int i = 0; i < 25; i++) {
            for (int j = i + 1; j < 26; j++) {
                HashSet<String> s1 = set[i];
                HashSet<String> s2 = set[j];
                int nomore = 0;
                for (String s : s1) {
                    if (s2.contains(s)) {
                        nomore++;
                    }
                }
                ans +=(s1.size()-nomore) * (s2.size()-nomore) * 2;

            }
        }

        return ans;
    }

}
