package Revision;

public class PrintAnagram {
    public static void main(String[] args) {
        String s = "123";
        printAnagramSolve(s, "");

    }

    private static void printAnagramSolve(String str,String ans ) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printAnagramSolve(ros, ans + ch);
        }
    }
}
