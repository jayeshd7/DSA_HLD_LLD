package LeetCodeDailyProblem.DailyStudyPlan.May2023;

public class MaximumTwinSumofaLinkedList {

    public static void main(String[] args) {

        int [] head = {5,4,2,1};
        System.out.println(maximumTwinSum(head));
    }

    private static int maximumTwinSum(int[] head) {
        int max = 0;
        for (int i = 0; i < head.length; i++) {
            for (int j = i + 1; j < head.length; j++) {
                if (head[i] == head[j]) {
                    max = Math.max(max, head[i] + head[j]);
                }
            }
        }
        return max;
    }
}
