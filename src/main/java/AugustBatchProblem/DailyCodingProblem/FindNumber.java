package AugustBatchProblem.DailyCodingProblem;

public class FindNumber {

    public static void main(String[] args) {
        int total = 19;
        int [] arr = {10, 15, 3, 7};
        int length = arr.length;
        boolean value = findNumber(total, arr,length);
        System.out.println(value);



    }




    private static boolean findNumber(int k, int [] arr, int n) {

        for(int i =0; i<n ;i++){
            int number = k - arr[i];
            for(int j = i+1; j<n; j++){
                if(number == arr[j]) {
                    System.out.println("number are:" + arr[i] +"&" + arr[j]);
                    return true;
                }
            }
        }
        System.out.println("numbers are not find");
        return false;
    }


}

// Time complexity = o(!n)
// space complexity = o(n)



