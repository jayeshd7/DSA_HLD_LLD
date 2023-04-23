package AugustBatchProblem.LLD.Factory.tax;

public class TaxMain {
    public static void main(String[] args) {
        Double oldTax = TaxCalculator.calculateTax(TaxRegime.OLD, new SalaryDetails(10000.0, 1000.0, 1000.0));
        Double newTax = TaxCalculator.calculateTax(TaxRegime.NEW, new SalaryDetails(10000.0, 1000.0, 1000.0));
        System.out.println("Old Tax: " + oldTax);
        System.out.println("New Tax: " + newTax);

    }
}
