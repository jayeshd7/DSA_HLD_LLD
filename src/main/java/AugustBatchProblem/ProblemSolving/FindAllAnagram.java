package AugustBatchProblem.ProblemSolving;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class FindAllAnagram {

    public static void findAllAnagrams(String X, String Y)
    {
        // `m` and `n` store the length of the string 'Y' and 'X', respectively
        int m, n;

        // invalid input
        if ((m = Y.length()) > (n = X.length())) {
            return;
        }

        // maintains the count of characters in the current window
        Multiset<Character> window = HashMultiset.create();

        // maintains the count of characters in the second string
        Multiset<Character> set = HashMultiset.create();

        // insert all characters of string 'Y' into a set
        for (int i = 0; i < m; i++) {
            set.add(Y.charAt(i));
        }

        // Note that Guava's `HashMultiset` can maintain duplicate
        // elements, unlike `java.util.HashSet`

        // maintain a sliding window of size `m` with adjacent characters
        // of string 'X'
        for (int i = 0; i < n; i++)
        {
            // add first `m` characters of string 'X' to the current window
            if (i < m) {
                window.add(X.charAt(i));
            }
            else {
                // If all characters in the current window match that of the
                // string 'Y', we found an anagram
                if (window.containsAll(set))
                {
                    System.out.println("Anagram " + X.substring(i - m, i) +
                            " present at index " + (i - m));
                }

                // consider the next substring of 'X' by removing the leftmost
                // element of the sliding window and add the next character
                // of string 'X' to it

                // delete only "one" occurrence of the leftmost element of the
                // current window
                if (window.contains(X.charAt(i - m))) {
                    window.remove(X.charAt(i - m));
                }

                // insert the next character of the string 'X' into the current window
                window.add(X.charAt(i));
            }
        }

        // if the last `m` characters of string 'X' matches that of string 'Y',
        // we found an anagram
        if (window.containsAll(set))
        {
            System.out.println("Anagram " + X.substring(n - m, n) +
                    " present at index " + (n - m));
        }
    }

    public static void main(String[] args)
    {
        String X = "XYYZXZYZXXYZ";
        String Y = "XYZ";

        findAllAnagrams(X, Y);
    }
}

