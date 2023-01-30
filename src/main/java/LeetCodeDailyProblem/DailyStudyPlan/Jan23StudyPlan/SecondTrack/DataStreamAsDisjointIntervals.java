package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class DataStreamAsDisjointIntervals {
    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        summaryRanges.addNum(3);
        summaryRanges.addNum(7);
        summaryRanges.addNum(2);
        summaryRanges.addNum(6);
        int[][] ans = summaryRanges.getIntervals();
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static class SummaryRanges {
        int[][] intervals;
        int size;

        public SummaryRanges() {
            intervals = new int[10][2];
            size = 0;
        }

        public void addNum(int val) {
            int index = binarySearchAlgo(val);
            if (index != -1) {
                return;
            }
            if (size == intervals.length) {
                int[][] temp = new int[size * 2][2];
                for (int i = 0; i < size; i++) {
                    temp[i][0] = intervals[i][0];
                    temp[i][1] = intervals[i][1];
                }
                intervals = temp;
            }
            int i = size - 1;
            while (i >= 0 && intervals[i][1] + 1 < val) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = intervals[i][1];
                i--;
            }
            if (i >= 0 && intervals[i][1] + 1 == val) {
                intervals[i][1] = val;
            } else {
                intervals[i + 1][0] = val;
                intervals[i + 1][1] = val;
                i++;
            }
            while (i < size - 1 && intervals[i][1] + 1 == intervals[i + 1][0]) {
                intervals[i][1] = intervals[i + 1][1];
                i++;
            }
            size = i + 1;
        }

        private int binarySearchAlgo(int val) {
            int start = 0;
            int end = size - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (intervals[mid][0] <= val && intervals[mid][1] >= val) {
                    return mid;
                } else if (intervals[mid][0] > val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

        public int[][] getIntervals() {
            int[][] ans = new int[size][2];
            for (int i = 0; i < size; i++) {
                ans[i][0] = intervals[i][0];
                ans[i][1] = intervals[i][1];
            }
            return ans;
        }

    }
}
