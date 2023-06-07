package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class MinimumFlipsToMake {

    public static void main(String[] args) {
        int  a = 2;
        int b = 6;
        int c = 5;

        System.out.println(minimumFlipToMake(a,b,c));
    }

    private static int minimumFlipToMake(int a, int b, int c) {

        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int lastBitOfA = a & 1;
            int lastBitOfB = b & 1;
            int lastBitOfC = c & 1;

            if (lastBitOfC == 0) {
                if (lastBitOfA == 1 && lastBitOfB == 1) {
                    flips += 2;
                } else if (lastBitOfA == 1 || lastBitOfB == 1) {
                    flips += 1;
                }
            } else {
                if (lastBitOfA == 0 && lastBitOfB == 0) {
                    flips += 1;
                }
            }

            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }




        return flips;
    }
}
