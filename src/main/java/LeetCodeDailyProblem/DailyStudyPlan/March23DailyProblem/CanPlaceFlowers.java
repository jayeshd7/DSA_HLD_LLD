package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int [] flowerBed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowersSolution(flowerBed, n));
    }

    private static boolean canPlaceFlowersSolution(int[] flowerBed, int n) {
        int len = flowerBed.length;
        int count = 0;
        for(int i = 0; i < len && count < n; i++){
            if(flowerBed[i] == 0){
                int next = (i == len - 1) ? 0 : flowerBed[i + 1];
                int prev = (i == 0) ? 0 : flowerBed[i - 1];
                if(next == 0 && prev == 0){
                    flowerBed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;

    }
}
