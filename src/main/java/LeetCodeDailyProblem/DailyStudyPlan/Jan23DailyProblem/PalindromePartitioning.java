package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> lists = palindromePartition(s);
        System.out.println(lists);
    }

    private static List<List<String>> palindromePartition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfsForPalindrome(s,0,new ArrayList<>(),ans);
        return ans;

    }

    private static void dfsForPalindrome(String s, int i, ArrayList<String> internal, List<List<String>> ans) {
        if(i==s.length()){
            ans.add(new ArrayList<>(internal));
            return;
        }
        for(int j = i;j<s.length();j++){
            if(isPalindromeString(s,i,j)){
                internal.add(s.substring(i,j+1));
                dfsForPalindrome(s,j+1,internal,ans);
                internal.remove(internal.size()-1);
            }
        }
    }

    private static boolean isPalindromeString(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
