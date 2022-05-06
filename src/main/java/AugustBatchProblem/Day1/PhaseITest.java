package AugustBatchProblem.Day1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class PhaseITest {
    public static void print_stageI(){
        String stageI = "******";
        Stream.of(1,2,3,4,5,6,5,4,3,2,1).map((a)->stageI.substring(6-a)).forEach(System.out::println);
    }

    public static void print_stageII(){
        String stageII = "    ";
        IntStream.range(0, 5).mapToObj((a)->stageII.substring(4-a) + "****").forEach(System.out::println);
    }

    public static void print_stageIII(){
        String stageIII = "_________";
        IntStream.range(0, 10).boxed().filter((a)->(a&1)==1).map((a)->{
            char[] ans = stageIII.substring(0,a).toCharArray();
            ans[0] =  '*';
            ans[ans.length-1] =  '*';
            return stageIII.replaceAll("_"," ").substring(0, (stageIII.length()-ans.length)/2) + new String(ans);
        }).forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("PHASE I");
        System.out.println("\nstage I\n");
        print_stageI();
        System.out.println("\nstage II\n");
        print_stageII();
        System.out.println("\nstage III\n");
        print_stageIII();
    }
}