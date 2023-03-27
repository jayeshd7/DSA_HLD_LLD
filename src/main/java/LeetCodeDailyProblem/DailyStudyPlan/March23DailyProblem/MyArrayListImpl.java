package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.util.Arrays;

public class MyArrayListImpl {
    private Object[] arrayImpl;
    private int actSize = 0;
    public MyArrayListImpl() {
        arrayImpl = new Object[10];
    }


    public Object get(int index) {
        if(index < actSize) {
            return arrayImpl[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void add(Object obj) {
        if(arrayImpl.length - actSize <= 5) {
            increaseListSize();
        }
        arrayImpl[actSize++] = obj;
    }

    public void increaseListSize() {
        arrayImpl = Arrays.copyOf(arrayImpl, arrayImpl.length*2);
        System.out.println("New length: "+arrayImpl.length);
    }
    public int getActSize() {
        return actSize;
    }


    public static void main(String[] args) {
        MyArrayListImpl list = new MyArrayListImpl();
        list.add("A");
        list.add("B");
        list.add("C");
        list.get(2);

    }
}
