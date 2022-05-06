package AugustBatchProblem.Advanced.Hashing;

import java.util.HashMap;
/*
Problem Description

Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array as a special pair if elements at that index in the array are equal.

Shaggy wants you to find a special pair such that distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array then return -1.



Problem Constraints

1 <= |A| <= 105


Input Format

First and only argument is the array A.


Output Format

Return one integer corresponding to the minimum possible distance between a special pair.


Example Input

Input 1:

A = [7, 1, 3, 4, 1, 7]

Input 2:

A = [1, 1]



Example Output

Output 1:

 3

Output 2:

 1



Example Explanation

Explanation 1:

Here we have 2 options:
1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
Therefore the minimum possible distance is 3.

Explanation 2:

Only possibility is choosing A[1] and A[2].

 */
public class ShaggyAndDistances {

    public static void main(String[] args) {
        int [] A = {7, 1, 3, 4, 1, 7};
        solveShaggyAndDistance(A);
    }

    private static int solveShaggyAndDistance(int [] a) {

        HashMap<Integer, Integer> hmap
                = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        // Initialize previousIndex
        // and currentIndex as 0
        int previousIndex = 0, currentIndex = 0;

        // Traverse the array and
        // find the minimum distance
        // between the same elements with map
        for (int i = 0; i < a.length; i++) {

            if (hmap.containsKey(a[i])) {
                currentIndex = i;

                // Fetch the previous index from map.
                previousIndex = hmap.get(a[i]);

                // Find the minimum distance.
                minDistance
                        = Math.min(
                        (currentIndex - previousIndex),
                        minDistance);
            }

            // Update the map.
            hmap.put(a[i], i);
        }

        // return minimum distance,
        // if no such elements found, return -1
        return (
                minDistance == Integer.MAX_VALUE ? -1 : minDistance);
    }
}


