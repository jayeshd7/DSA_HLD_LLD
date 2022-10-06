package AugustBatchProblem.ExaBeam;

public class ReverseString {

    public static void main(String[] args) {
        String s = "a..b!c,d.e@f,ghi";

        System.out.println(reverseStringWithSpecialChar(s));
    }

    private static String reverseStringWithSpecialChar(String s) {

        int n = s.length();
        int start = 0;
        int end = n - 1;

        char[] Str = s.toCharArray();

        while (start < end)
        {
            if (!Character.isAlphabetic(Str[start]))
            {
                start++;
                continue;
            }
            else if (!Character.isAlphabetic(Str[end]))
            {
                end--;
                continue;
            }

            else
            {
                char temp = Str[start];
                Str[start] = Str[end];
                Str[end] = temp;
                start++;
                end--;
            }
        }

    return String.valueOf(Str);
    }

}
