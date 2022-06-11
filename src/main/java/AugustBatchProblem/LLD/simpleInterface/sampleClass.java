package AugustBatchProblem.LLD.simpleInterface;

public class sampleClass implements Carnival, Hurbibour{
    @Override
    public void eatPlant() {
        System.out.println("carnival");
    }

    @Override
    public void eatPlants() {
        System.out.println("Hurbibour");

    }
}
