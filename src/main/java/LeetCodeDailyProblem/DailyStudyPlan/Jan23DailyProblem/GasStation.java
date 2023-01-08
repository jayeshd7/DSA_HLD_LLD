package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int total = 0;
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            int consume = gas[i] - cost[i];
            if (tank + consume < 0) {
                start = i + 1;
                tank = 0;
            } else {
                tank += consume;
            }
            total += consume;
        }
        return total >= 0 ? start : -1;
    }
}
