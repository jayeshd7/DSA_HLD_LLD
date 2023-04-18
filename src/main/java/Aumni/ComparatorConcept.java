package Aumni;

import java.util.Comparator;

public class ComparatorConcept implements Comparator<ComparatorConcept> {
    int first;
    int second;

    public ComparatorConcept(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compare(ComparatorConcept o1, ComparatorConcept o2) {
        if (o1.first == o2.first) {
            return o1.second - o2.second;
        }
        return o1.first - o2.first;
    }

}
