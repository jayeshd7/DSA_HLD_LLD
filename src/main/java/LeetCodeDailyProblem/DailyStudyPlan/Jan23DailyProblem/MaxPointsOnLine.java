package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class MaxPointsOnLine {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(maxPoints(points));
    }

    private static int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3) {
            return n;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int[] p1 = points[i];
            for (int j = i + 1; j < n; j++) {
                int[] p2 = points[j];
                int count = 0;
                for (int k = 0; k < n; k++) {
                    int[] p3 = points[k];
                    if ((p2[1] - p1[1]) * (p3[0] - p1[0]) == (p3[1] - p1[1]) * (p2[0] - p1[0])) {
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
