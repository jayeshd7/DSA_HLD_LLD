package FOX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("list of size");
        int listSize = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            System.out.println("number entered..");
            list.add(sc.nextInt());
        }
        int count = 0;
        for (int i = 0; i < listSize; i++) {
            if (list.get(i)% 2 == 0) {
                count++;
            }

        }
        System.out.println("even count is " + count);

    }
}
