package AugustBatchProblem.StringProblems;



public class Lexographical {

    public static void main(String[] args) {
       String ans =solve("abcdefgh_zzz");
        System.out.println(ans);

        // cbb_a
    }

    private static String solve(String A) {
        String [] temp = A.split("_");


        //["aacdefgh", "zzz"]

        int [] freq = new int[26];
        String T2 = temp[1];
        char[] T1 = temp[0].toCharArray();

        for(int i =0 ;i<temp[1].length();i++){
            freq[T2.charAt(i)-'a'] +=1;
        }
        for(int j = 0;j<temp[0].length();j++){
            for(int k = 25;k>= 0;k--){

                if(freq[k] > 0 && T1[j]< ('a'+ k)){
                    T1[j] = (char) ('a'+ k);
                    freq[k] --;
                    break;
                }
            }

        }

        return new String(T1);

    }
}



