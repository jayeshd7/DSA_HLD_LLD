package AugustBatchProblem.Hashing;

import java.util.ArrayList;
import java.util.List;

public class PalindromeInString {

    public static void main(String[] args) {
        String s = "aabba";
        solve(s);
    }


        public static int solve(String str) {
            // Create a list
            List<Character> list = new ArrayList<Character>();


            // remove character if list contains
            // else add character to list
            for (int i = 0; i < str.length(); i++)
            {
                if (list.contains(str.charAt(i)))
                    list.remove((Character)str.charAt(i));
                else
                    list.add(str.charAt(i));
            }

            // if character length is even
            // list is expected to be empty or
            // if character length is odd list size
            // is expected to be 1


            // if string length is even
            if (str.length() % 2 == 0
                    && list.isEmpty()
                    || (str.length() % 2 == 1
                    && list.size()
                    == 1))
                return 1;

                // if string length is odd
            else
                return 0;
        }
    }

