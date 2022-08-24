package AugustBatchProblem.StringProblems;

public class IsPermutation {

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "plep";
        System.out.println(isPermutation(s1,s2));
    }

    private static Boolean isPermutation(String s1, String s2) {

        int [] count = new int [256];

        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i<256;i++){
            count[i] = 0;
        }
        for(int i = 0; i<s1.length();i++){
            char ch = s1.charAt(i);
            count[ch]++;
            ch = s2.charAt(i);
            count[ch]--;
        }
        for(int i = 0; i<s1.length();i++){
            if(count[i] !=0){
                return false;
            }
            else { return true;}
        }
        return true;
    }
}
