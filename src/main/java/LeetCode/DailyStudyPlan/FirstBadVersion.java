package LeetCode.DailyStudyPlan;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5,4));
    }

    private static int firstBadVersion(int n, int bad) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid, bad)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isBadVersion(int mid, int bad) {
        return mid >= bad;
    }
}
