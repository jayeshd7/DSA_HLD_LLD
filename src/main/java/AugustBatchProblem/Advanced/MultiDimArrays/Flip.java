package AugustBatchProblem.Advanced.MultiDimArrays;

public class Flip {
    public static void main(String[] args) {
        String A = "011101";
        int B [] = solve(A);
        for(int j=0;j<B.length;j++){
            System.out.println(B[j]);
        }
    }

    private static int[] solve(String A) {
        int arr [] = new int[A.length()];
        int empty[] = {};
        boolean flag = false;

        //what we need to do here is make 1 to -1 and 0 to 1.Why??
        //as we need to  maximize the number 1 in A string,this can be only done on zeros
        //so if we are able to find the substring that have maxm number of zero(1 converted  //above) wll got our ans.
        //

        for(int i=0;i<arr.length;i++){
            arr[i]= A.charAt(i)-'0' == 0?1:-1;
        }

        int curr = 0;
        int max = 0;
        int temp_start =0 , start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(curr+arr[i]<0){
                curr  = 0;
                temp_start = i+1;
            }else{
                curr+=arr[i];
            }

            if(max<curr){
                max = curr;
                end = i;
                start = temp_start;
                flag = true;
            }

        }
        if(flag==false)return empty;

        int result[] = new int[2];

        result[0] = start+1;
        result[1] = end+1;

        return result;
    }
}
