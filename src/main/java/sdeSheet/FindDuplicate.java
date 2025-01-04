package sdeSheet;

import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int ans = findDuplicate(arr);
        System.out.println("Duplicate element: " + ans);
    }

    private static int findDuplicate(int[] arr) {

        int n = arr.length;

        // space complexity: O(n)
//        int[] freq = new int[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            if (freq[arr[i]] == 0) {
//                freq[arr[i]] +=1;
//            } else {
//                return arr[i];
//            }
//        }
//        return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                return arr[i];
            }
        }
        return 0;
    }
}
