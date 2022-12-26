package a;

import java.util.ArrayList;
import java.util.Stack;

public class StackPop {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove(2));
    }
}
