package AugustBatchProblem.RandomProblems;

import java.util.HashSet;

public class HashingConcept {


    public static void main(String[] args) {

        hashingConcept();
    }

    private static void hashingConcept() {

        HashSet<String> hashSet = new HashSet<String>(5);
        hashSet.add("jayesh");
        hashSet.add("bhavi");
        hashSet.add("pooja");
        System.out.println(hashSet);
        if(hashSet.contains("poo")){
            System.out.println("Present");
        }
        System.out.println(hashSet.iterator().hasNext());
        System.out.println(hashSet.size());
        hashSet.forEach(item-> System.out.println(item));

        hashSet.stream()
                .filter(s->s.contains("jayesh"))
                .forEach(System.out::println);

    }
}
