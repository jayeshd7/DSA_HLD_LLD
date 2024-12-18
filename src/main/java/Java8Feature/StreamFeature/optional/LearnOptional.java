package Java8Feature.StreamFeature.optional;

import java.util.Optional;

public class LearnOptional {

    public static Optional getName(String name) {
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {


        String str = null;

        Optional optional = getName(str);

        optional.ifPresent(System.out::println);

        // print the value if present, otherwise print "No value present"

        System.out.println(optional.orElse("No value present"));


    }
}
