package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        int[] time = {2};
        int totalTrip = 1;
        System.out.println(minimumTimeRequired(time, totalTrip));
    }

    private static long minimumTimeRequired(int[] time, int totalTrips) {
        long l=1;
        long max=0;
        for(int x:time) max=Math.max(max,x);
        long h=max*totalTrips; //compute upper limit

        while(l<h){
            long mid=l+(h-l)/2;
            if(compute(time,mid,totalTrips)){
                h=mid;
                //if mid is a valid answer, it can be the answer
            }
            else l=mid+1;
        }
        return h;
    }
    public static boolean compute(int[] time,long key,int totalTrips){
//This part of the code has been used in problems like
// Leetcode 1011
        long trips=0;
        for(int x:time){
            trips+= key/x;
            //number of trips made by a bus is total time/time it takes
            //the bus to complete one trip
        }
        if(trips>=totalTrips) return true;
        return false;
    }



}
