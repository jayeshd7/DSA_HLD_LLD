package b;
import a.Outer;

public class Reference {

    public static void main(String[] args) {
        Outer.invoke(() -> 1);
    }
}
