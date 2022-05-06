package AugustBatchProblem.StringProblems;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abcdefgh");
        arrayList.add("aefghijk");
        arrayList.add("abcefgh");
        solve(arrayList);
    }

    private static String solve(ArrayList<String> A) {

        if (A.size() > 1) {
            int index = 0;
            outer:
            while (index >= 0) {
                for (int i = 0; i < A.size() - 1; i++) {
                    if (A.get(i).length() > index && A.get(i + 1).length() > index) {
                        char char1 = A.get(i).charAt(index);
                        char char2 = A.get(i + 1).charAt(index);
                        //System.out.println(char1 +" "+char2);
                        if ((char1 - char2) != 0)
                            break outer;
                    } else {
                        break outer;
                    }
                }
                index++;
            }
            System.out.println(index);
            if (index > 0) {
                System.out.println(A.get(0).substring(0, index));
                return A.get(0).substring(0, index);
            }
            else
                return "";
        } else {
            return A.get(0);
        }
    }
}
