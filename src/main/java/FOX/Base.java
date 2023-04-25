package FOX;

class Base {
    int a = 10;
    public void show() {
        System.out.println("Base");
    }
}
class Derived extends Base {
    int a = 20;
    public void show() {
        System.out.println("Derived");
    }
}
class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();  //("Dervied")


        System.out.println(b.a);
    }
}
