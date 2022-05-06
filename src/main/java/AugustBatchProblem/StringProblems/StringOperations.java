package AugustBatchProblem.StringProblems;

public class StringOperations {

    public static void main(String[] args) {
        solve("AbcaZeoB");

        /*
        First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
        Delete all the uppercase letters so string A becomes "bcaeobcaeo".
        Now replace vowel with '#'.
        A becomes "bc###bc###".
         */

    }
    public static String solve(String A) {
        String B = A.concat(A);
        //System.out.println(B);
        StringBuilder sb = new StringBuilder();

        sb.append(B);


        for (int i = sb.length() - 1; i >= 0; i--) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.deleteCharAt(i);

            }
        }

        String actual = sb.toString();
        actual.replaceAll("[aeiou]","#");
        System.out.println(actual.replaceAll("[aeiou]","#"));




        return "";
    }
}

