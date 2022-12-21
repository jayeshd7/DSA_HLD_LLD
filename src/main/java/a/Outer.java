package a;

public class Outer {

    private static class Inner {

        @FunctionalInterface
        public interface Supplier {
            int getInt();
        }
    }
    public static void invoke(Inner.Supplier supplier) {
        System.out.println(supplier.getInt());
    }
}
