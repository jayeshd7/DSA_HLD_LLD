package AugustBatchProblem.RandomProblems;

import java.util.HashSet;

public class FirstRepeatingElement {

    // This function prints the first repeating element in arr[]
    static int printFirstRepeating(int[] arr)
    {
        // Initialize index of first repeating element
        int min = -1;

        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<Integer>();

        // Traverse the input array from right to left
        for (int i=arr.length-1; i>=0; i--)
        {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;

            else   // Else add element to hash set
                set.add(arr[i]);
        }

        // Print the result
        if (min != -1)
            return min;
        else
            return -1;

    }

    // Driver method to test above method
    public static void main (String[] args) throws Exception
    {
        int arr[] = {10, 2, 3, 4, 3, 5, 6};
        int n = printFirstRepeating(arr);
        System.out.println(n);
    }
}
