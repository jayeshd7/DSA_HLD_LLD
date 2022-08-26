package AugustBatchProblem.Revision;

public class MaxFrequencySoFar {

    public static void main(String[] args) {
        int [] a = {5,1,4,5,6};
        System.out.println(maxFrequency(a));
    }

    private static int maxFrequency(int[] a) {
        int ansCount = 0;
        int ansIndex = 0;
        int count = 1;
        for(int i = 0; i<a.length;i++){
            if(a[i] == a[ansIndex]){
                count++;
            }else {count --;}

            if(count == 0){
                ansIndex = i;
                count = 1;
            }
        }
        int value = a[ansIndex];

        for(int i = 0; i<a.length;i++){
            if(a[i] == value){ansCount++;}
        }
        System.out.println("Digit which is more than N/2 is : "+" " +value + "and count is :" + ansCount);
        if (ansCount > (a.length/2)) return ansCount;

        return -1;
    }
}
