package AugustBatchProblem.Advanced.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MergeOverlappingInterval {

    public static void main(String[] args) {



    }
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null) return null;

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        ArrayList<Interval> x = new ArrayList<>();

        for (Interval current : intervals) {
            if (x.isEmpty() || x.get(x.size() -1).end < current.start) {
                x.add(current);
            } else {
                x.get(x.size() -1).end = Math.max(current.end,
                        x.get(x.size() -1).end);
            }
        }
        return x;
    }
}

