package LeetCodeDailyProblem.biweekly317;

public class EvenNumberDivideBy3 {
    public static void main(String[] args) {
        int[] a = {1, 3,6,10,12,15};
        int sum = 0;
        int count = 0;
        int average ;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] % 3 == 0) {
                count++;
                sum += a[i];
            }
        }

        if (count == 0) {
            System.out.println(0);

        } else {
            average = sum / count;
            System.out.println(average);
        }

    }
}
