package AugustBatchProblem.Advanced.Queue;

import java.util.ArrayList;
/*
Given an integer A. Find and Return first positive A integers in ascending order containing only digits 1, 2 and 3.

NOTE: All the A integers will fit in 32 bit integer.



Problem Constraints

1 <= A <= 29500


Input Format

The only argument given is integer A.


Output Format

Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.


Example Input

Input 1:

 A = 3

Input 2:

 A = 7



Example Output

Output 1:

 [1, 2, 3]

Output 2:

 [1, 2, 3, 11, 12, 13, 21]



Example Explanation

Explanation 1:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.

Explanation 2:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
 */
public class NIntegerContaining {

    public static void main(String[] args) {
        System.out.println(solveNIntegerContaing(12));
    }

    private static ArrayList<Integer> solveNIntegerContaing(int A) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; ; i++) {

            if (check(i) == true) {

                ans.add(i);

            }

            if (ans.size() == A || ans.size() == 12) {

                break;

            }

        }

        int prev_size = 3;

        //int key = 2;

        while (A > ans.size()) {

            int n = ans.size();

            for (int i = prev_size; i < n; i++) {

                for (int j = 1; j <= 3; j++) {

                    ans.add(ans.get(i) * 10 + j);

                    if (ans.size() == A) {

                        break;

                    }

                }

                if (ans.size() == A) {

                    break;

                }

            }

            if (ans.size() == A) {

                break;

            }

            prev_size = n;

            //key++;

        }

        return ans;
    }

    static boolean check(int num) {

        while (num != 0) {

            int k = num % 10;

            if (k == 1 || k == 2 || k == 3) {

                num = num / 10;

                continue;

            } else {

                return false;

            }

        }

        return true;

    }
}



