package Top50DSASDET;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    private static boolean canFinish(int[] piles, int h, int mid) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / mid + 1;
        }
        return time <= h;
    }
}
