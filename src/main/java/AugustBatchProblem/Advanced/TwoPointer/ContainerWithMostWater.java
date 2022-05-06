package AugustBatchProblem.Advanced.TwoPointer;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int [] height = {1, 5, 4, 3};
        System.out.println(solveContainerWithMostWater(height));
    }

    private static int solveContainerWithMostWater(int [] height) {

        int l = 0;
        int r = height.length -1;
        int sum = 0;
        int area;

        while (l<r){
            area = (r-l) * Math.min(height[l],height[r]);
            sum = Math.max(sum, area);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return sum;
    }
}
