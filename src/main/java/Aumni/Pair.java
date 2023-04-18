package Aumni;

public class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair pair) {
        if (this.first == pair.first) {
            return this.second - pair.second;
        }
        return this.first - pair.first;
    }
}

