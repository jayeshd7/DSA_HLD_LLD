package AugustBatchProblem.Revision;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "abc";
        int l = 0;
        int r = s.length()-1;
        permutationOfString(s,l,r);
    }

    private static void permutationOfString(String s, int l, int r) {
        if(l == r){
            System.out.println(s);
            return;
    }

        for(int i = l ; i<=r;i++){
                 s = swap(s,l,i);
                permutationOfString(s,l+1,r);
                 s = swap(s,l,i);

        }
    }

    private static String swap(String s, int l, int i) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }
}
