package AugustBatchProblem.DailyCodingProblem;

public class ThirdProblem {

    public static void main(String[] args) {

        String toFind = "je";
        String arrayString [] = {"dog", "deer", "deal"};

        for (String a:arrayString) {
            if(!toFind.isEmpty() && a.contains(toFind)){
                System.out.println("Find string" + "\t" +toFind + "\t inside a arrayString \t "+a );
            }
            else {
                System.out.println("Not find");
            }


        }
    }
}
