package AugustBatchProblem.Advanced.MathsProblems.GCD;

import java.util.*;

/*
Problem Description

Given an array of integers A of size N containing GCD of every possible pair of elements of another array.

Find and return the original numbers which are used to calculate the GCD array in any order. For example, if original numbers are {2, 8, 10} then the given array will be {2, 2, 2, 2, 8, 2, 2, 2, 10}.
 */
public class AllGcdPair {

    public static void main(String[] args) {
        int [] A1 = { 1, 31, 1, 1, 1, 1, 14, 2, 1, 1, 1, 2, 22, 1, 11, 1, 1, 1, 1, 23, 1, 1, 11, 1, 11};
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(31);A.add(1);A.add(1);A.add(1);A.add(1);A.add(14);A.add(2);
        A.add(1);A.add(1);A.add(1);A.add(2);A.add(22);A.add(1);A.add(11);A.add(1);
        A.add(1);A.add(1);A.add(1);A.add(23);A.add(1);A.add(1);A.add(11);A.add(1);A.add(11);
        //op
        int [] ans = allGcdPairSolve(A1);
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        System.out.println(solveViaArrayList(A));

        //[ 2,8,10] - 2
        // [2,2,2,2,2,8,10 ] - 2
    }

    private static int [] allGcdPairSolve(int [] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        reverse(arr);
        int freq[] = new int[arr[0] + 1];

        // Count frequency of each element
        for (int i = 0; i < n; i++)
        {
            freq[arr[i]]++;
        }

        // Size of the resultant array
        int size = (int) Math.sqrt(n);
        int brr[] = new int[size], x, l = 0;

        for (int i = 0; i < n; i++)
        {
            if (freq[arr[i]] > 0 && l < size)
            {

                // Store the highest element in the resultant array

                brr[l] = arr[i];

                // Decrement the frequency of that element
                freq[brr[l]]--;
                l++;
                for (int j = 0; j < l; j++)
                {
                    if (i != j)
                    {

                        // Compute GCD
                        x = __gcd(arr[i], brr[j]);

                        // Decrement GCD value by 2
                        freq[x] -= 2;
                    }
                }
            }
        }

       return brr;
    }

    // reverse array
    public static void reverse(int[] input)
    {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++)
        {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

    static int __gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return __gcd(b, a % b);

    }


    // second approch

    public static ArrayList < Integer > solveViaArrayList(ArrayList < Integer > A) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        //int size = (int) Math.pow(A.size(), 0.5);
        Collections.sort(A, Collections.reverseOrder());
        HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
        for (int i = 0; i < A.size(); i++) {
            int x = A.get(i);
            if (mp.containsKey(x) && mp.get(x) > 0)
                mp.put(x, mp.get(x) - 1);
            else {
                for (int j = 0; j < ans.size(); j++) {
                    int g = __gcd(ans.get(j), x);

                    if (mp.containsKey(g))
                        mp.put(g, mp.get(g) + 2);
                    else
                        mp.put(g, 2);
                }
                ans.add(x);
            }
        }
        return ans;
    }

}
