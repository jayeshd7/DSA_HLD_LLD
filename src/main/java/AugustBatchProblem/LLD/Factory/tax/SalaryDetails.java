package AugustBatchProblem.LLD.Factory.tax;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SalaryDetails {
    private Double basePay;
    private Double hra;

    public SalaryDetails(Double basePay, Double hra, Double lta) {
        this.basePay = basePay;
        this.hra = hra;
        this.lta = lta;
    }

    private Double lta;
}
