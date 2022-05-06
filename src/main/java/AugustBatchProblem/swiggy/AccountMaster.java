package AugustBatchProblem.swiggy;

public class AccountMaster {
    int accountNo;
    String customerName;
    String placeCode;
    String gender;
    int balance;

    AccountMaster(){

    }
    AccountMaster( int accountNo ,String customerName, String placeCode, String gender, int balance){
            this.accountNo = accountNo;
            this.customerName =customerName;
            this.placeCode= placeCode;
            this.gender=gender;
            this.balance = balance;

    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBalance() {
        return balance;
    }

    public int setBalance(int balance) {
        this.balance = balance;
        return balance;
    }
}
