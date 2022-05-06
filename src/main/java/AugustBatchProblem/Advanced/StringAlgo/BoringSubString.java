package AugustBatchProblem.Advanced.StringAlgo;

public class BoringSubString {

    public static void main(String[] args) {
        System.out.println(solveBoring("abcd"));
    }

    private static int solveBoring(String A) {

        int n = A.length();
        int [] freq = new int[26];


        for(int i =0; i<n ; i++){
            char ch = A.charAt(i);
            freq[ch -'a']++;
        }
        int first_even = 0; int even_flag = 0;
        int first_odd = 0; int odd_flag = 0;


        for(int i = 0; i<26;i++){
            if(freq[i] !=0 && (i&1)==0 & even_flag ==0){
                first_even = i;
                even_flag = 1;
            }
            if(freq[i] != 0 && (i&1)!=0 && odd_flag == 0)
            {
                first_odd = i;
                odd_flag = 1;
            }
            if(even_flag == 1 && odd_flag == 1)
                break;
        }
        int last_even = 0;
        int last_odd = 0;
        even_flag = 0;
        odd_flag = 0;
        for(int i=25; i>=0; i--)
        {
            if(freq[i] != 0 && (i&1)==0 && even_flag == 0)
            {
                last_even = i;
                even_flag = 1;
            }
            if(freq[i] != 0 && (i&1)!=0 && odd_flag == 0)
            {
                last_odd = i;
                odd_flag = 1;
            }
            if(even_flag == 1 && odd_flag == 1)
                break;
        }
        if( (last_even+1 == first_odd || last_even-1 == first_odd) && (last_odd+1 == first_even
                || last_odd-1 == first_even) )
            return 0;

        return 1;
    }
}
