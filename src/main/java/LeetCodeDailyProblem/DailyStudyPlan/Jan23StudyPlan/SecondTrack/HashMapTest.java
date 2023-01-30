package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<TestClass, String> map = new HashMap<>();
        map.put(new TestClass("a"), "a");
        map.put(new TestClass("b"), "b");
        System.out.println(map.get(new TestClass("a")) + " " + map.get(new TestClass("b")));
    }

    static class TestClass{

        public String name;

        public TestClass(String name) {
            this.name = name;
        }

        public boolean equals(Object o){
            if(o instanceof TestClass){
                return ((TestClass) o).name.equals(this.name);
            }
            return false;
        }

        public int hashCode(){
            return name.hashCode();
        }

    }
}
