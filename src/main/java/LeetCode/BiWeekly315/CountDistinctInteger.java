package LeetCode.BiWeekly315;

import java.util.HashSet;

public class CountDistinctInteger {
    public static void main(String[] args) {
        int [] input = {1,12,13,10,31};
        int n = input.length;
        System.out.println(countDistinctInteger(input, n));
    }

    private static int countDistinctInteger(int[] input, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(input[i]);
        }
        for(int num:input){
            hs.add(getRev(num));
        }
        return hs.size();

    }

    private static Integer getRev(int num) {
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = ans*10+rem;
            num = num/10;
        }
        return ans;
    }
}
