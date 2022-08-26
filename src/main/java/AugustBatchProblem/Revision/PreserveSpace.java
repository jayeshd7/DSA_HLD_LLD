package AugustBatchProblem.Revision;

public class PreserveSpace {

    public static void main(String[] args) {
        String s = "I am string";

        preserveSpaceSol(s);
    }

    private static void preserveSpaceSol(String s) {

        int n = s.length();
        int start = 0;
        int end = n-1;

        char [] ch = s.toCharArray();

        while(start<end){

            if(ch[start] == ' '){
                start++;
                continue;
            }
            else if(ch[end] == ' '){
                end--;
                continue;
            }
            else
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
