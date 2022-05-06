package AugustBatchProblem.Advanced.Recursion;

public class towerOfHanoi {

    public static void main(String[] args) {
        int n = 3;
        solvetowerOfHanoi(n, 'A', 'C', 'B');
    }

    private static void solvetowerOfHanoi(int n, char from_rod, char to_rod, char mid_rod) {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod "+
                    from_rod+" to rod "+to_rod);
            return;
        }
        solvetowerOfHanoi(n - 1, from_rod, mid_rod, to_rod);
        System.out.println("Move disk "+ n + " from rod " +
                from_rod +" to rod " + to_rod );
        solvetowerOfHanoi(n - 1, mid_rod, to_rod, from_rod);
    }
}
