package FOX;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int [] arr = {1,8,5,2,7};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("second max is " + secondMax);
    }
}
