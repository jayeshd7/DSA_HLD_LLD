package Sorting;

public class LongesNumberSequence {

    public static void main(String[] args) {
        String input = "abc5678def1234xyz23";

        int size = input.length();
        LongesNumberSequence longesNumberSequence = new LongesNumberSequence();
       String ans = longesNumberSequence.longestNumberSequenceSolve(input, size);
        System.out.println(ans);

    }

    String longestNumberSequenceSolve(String num, int size) {
        String ans = String.valueOf(0);
        int i = 0;
        while (i < size) {
            while (i < size && !Character.isDigit(num.charAt(i))) {
                i++;
            }
            int start = i;
            while (i < num.length() && Character.isDigit(num.charAt(i))) {
                i++;
            }
            if (i - start > ans.length()) {
                ans = num.substring(start, i);
            }
        }
        return ans;
    }


}

