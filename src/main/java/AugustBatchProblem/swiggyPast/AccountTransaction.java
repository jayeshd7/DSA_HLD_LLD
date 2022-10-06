package AugustBatchProblem.swiggyPast;

public class AccountTransaction {



    int accountNo;
    int amount;
    String transcationType;

    AccountTransaction(){

    }

    public AccountTransaction(int accountNo, int amount, String transcationType) {
        this.accountNo = accountNo;
        this.amount = amount;
        this.transcationType = transcationType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTranscationType() {
        return transcationType;
    }

    public void setTranscationType(String transcationType) {
        this.transcationType = transcationType;
    }
}
