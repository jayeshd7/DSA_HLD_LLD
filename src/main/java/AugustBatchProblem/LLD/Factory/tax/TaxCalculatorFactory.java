package AugustBatchProblem.LLD.Factory.tax;

import AugustBatchProblem.LLD.Factory.tax.algorithm.NewTaxAlgorithm;
import AugustBatchProblem.LLD.Factory.tax.algorithm.OldTaxAlgorithm;
import AugustBatchProblem.LLD.Factory.tax.algorithm.TaxAlgorithm;


public class TaxCalculatorFactory {

    public static TaxAlgorithm getTaxCalculator(TaxRegime regime) {
        switch (regime) {
            case OLD:
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }

        throw new RuntimeException("Invalid regime" + regime);
    }
}
