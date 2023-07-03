package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

public class MaximumNumberOfAchievableTransferRequests {

    public static void main(String[] args) {
        int n = 5;
        int [][] requests = {{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
        System.out.println(maximumNumberOfAchievableTransferRequests(n, requests));
    }

    private static int maximumNumberOfAchievableTransferRequests(int n, int[][] requests) {
        int[] indegree = new int[n];
        return helperNumberOfTransferRequest(0, requests, indegree, n, 0);
    }

    private static int helperNumberOfTransferRequest(int start, int[][] requests, int[] indegree, int n, int count) {
        if (start == requests.length) {
            for (int i = 0; i < n; i++) {
                if (indegree[i] != 0) {
                    return 0;
                }
            }
            return count;
        }

        // Take
        indegree[requests[start][0]]--;
        indegree[requests[start][1]]++;
        int take = helperNumberOfTransferRequest(start + 1, requests, indegree, n, count + 1);

        // Not-take
        indegree[requests[start][0]]++;
        indegree[requests[start][1]]--;
        int notTake = helperNumberOfTransferRequest(start + 1, requests, indegree, n, count);

        return Math.max(take, notTake);
    }
}
