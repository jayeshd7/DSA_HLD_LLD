package Revision;

public class SubArraySum {

    public static void main(String[] args) {
        int [] arr = {15,5,5,20,10,5,5,20,10,10};
        int size = arr.length;
        System.out.println(subArraySumSolve(arr, size, 20));
    }

    private static int subArraySumSolve(int[] arr, int size, int value) {

        int first = 0;
        int second = 0;
        int sum = arr[first];

        while(second<size && first <size){
            if(sum == value){
                System.out.println(first+ "and" + second );
            }
            if(sum <value){
                second += 1;
                if(second <size){
                    sum += arr[second];
                }
            }

            else {
                sum -= arr[first];
                first +=1;
            }
        }
        return sum;
    }
}
