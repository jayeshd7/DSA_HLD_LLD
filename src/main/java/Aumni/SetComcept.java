package Aumni;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SetComcept implements Comparable<SetComcept> {
    public static void main(String[] args) {
       List<String> sampleList = Collections.synchronizedList(new ArrayList<String>());
         sampleList.add("A");
        sampleList.add("B");
        sampleList.add("A");

        String[] values = new String[sampleList.size()];
        values = sampleList.toArray(values);
        System.out.println("Array: " + Arrays.toString(values));

        System.out.println("List: " + sampleList);
        long count = sampleList.stream().filter(s -> s.equals("A")).count();
        System.out.println("Count: " + count);


    }

    private static void comparablePractice() {
    }

    @Override
    public int compareTo(@NotNull SetComcept o) {
        return 0;
    }
}
