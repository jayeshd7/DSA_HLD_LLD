package AugustBatchProblem.Advanced.javaDP;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >150;
    }
}
