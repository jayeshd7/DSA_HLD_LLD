package LeetCodeDailyProblem.Weekly332;

import java.util.HashMap;
import java.util.Map;

public class SubStringXorQueries {
    public static void main(String[] args) {
        String s = "101101";
        int[][] queries = {{0, 5},{1,2}};
        int[][] result = xorQueries(s, queries);
        for(int i = 0;i<result.length;i++) {
            for(int j = 0;j<result[i].length;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] xorQueries(String s, int[][] queries) {

        int n = s.length();
        int m = queries.length;
        int[][] result = new int[m][2];
        Map<Integer, int[]> known = new HashMap<>();
        boolean foundZero = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (!foundZero) {
                    known.put(0, new int[]{i, i});
                    foundZero = true;
                }
                continue;

            }

            int val = 0;
            int upperBound = Math.min(s.length(), i + 30);
            for (int j = i; j < upperBound; j++) {
                val <<= 1;
                if (s.charAt(j) == '1') {
                    val++;
                }
                if (!known.containsKey(val)) {
                    known.put(val, new int[]{i, j});
                }
            }
        }

        for(int i = 0;i< queries.length;i++){
            result[i] = known.getOrDefault(queries[i][0] ^ queries[i][1], new int[]{-1, -1});
        }
        return result;
    }
}
