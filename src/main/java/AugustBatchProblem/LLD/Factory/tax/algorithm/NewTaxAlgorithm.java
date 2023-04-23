package AugustBatchProblem.LLD.Factory.tax.algorithm;

import AugustBatchProblem.LLD.Factory.tax.SalaryDetails;

;

public class NewTaxAlgorithm implements TaxAlgorithm {
    @Override
    public Double calculateTax(SalaryDetails details) {
        double basePay = details.getBasePay();
        double hra = details.getHra();
        double lta = details.getLta();
        return (basePay + hra + lta) * 0.2;

    }
}
