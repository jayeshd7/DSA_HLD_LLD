package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class    MinimizeDifference {

    public static void main(String[] args) {


            int arr[] = {4, 6, 3, 1, 4};
            int n = 5;
            int k = 5;

            System.out.println("Max height difference = "
                    + solve(arr, n, k));

            // 1 3 4 4 6 --> 1
            // 1 3 4 4 5 --> 1
            // 1 3 4 4 4 -->

    }

    private static int solve(int[] A, int n, int B) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i:A){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
            min = Math.min(i, min);
            max = Math.max(i,max);
        }

        while (min<max) {
            if (hashMap.get(min) < hashMap.get(max)) {
                int cnt = hashMap.get(min);
                if (B < cnt) {
                    break;

                }
                min++;
                hashMap.put(min, hashMap.getOrDefault(min, 0) + cnt);
                B = B - cnt;
            } else {
                int cnt = hashMap.get(max);
                if (B < cnt) {
                    break;

                }
                max--;
                hashMap.put(max, hashMap.getOrDefault(max, 0) + cnt);
                B = B - cnt;
            }
        }
        System.out.println(max-min);

        return max-min;
    }
}
