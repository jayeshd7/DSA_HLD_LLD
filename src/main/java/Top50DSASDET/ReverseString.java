package Top50DSASDET;

public class ReverseString {
    public static void main(String[] args) {
        String s = "my name is jayesh";
        System.out.println(reverseStringSol(s));
    }

    private static String reverseStringSol(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
