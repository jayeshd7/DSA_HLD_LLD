package sdeSheet;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int ans = findDuplicate(arr);
        System.out.println("Duplicate element: " + ans);
    }

    private static int findDuplicate(int[] arr) {

        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] +=1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }
}
