package AugustBatchProblem.swiggyPast;

public class OutputLogic {

    public static void main(String[] args) {



        AccountMaster am = new AccountMaster();

        AccountTransaction at = new AccountTransaction();
        //1001,rama,11,m,5000
        //1001,2500,cr
        //1002,krishan,12,m,8000
        ///1002,8000,dr
        am.setAccountNo(1001);am.setCustomerName("rama");am.setPlaceCode("11");am.setGender("M");am.setBalance(5000);
        at.setAccountNo(1001);at.setAmount(2500);at.setTranscationType("cr");

        am.setAccountNo(1002);am.setCustomerName("krishna");am.setPlaceCode("12");am.setGender("M");am.setBalance(8000);
        at.setAccountNo(1002);at.setAmount(8000);at.setTranscationType("dr");

        // First TC : if the transaction type is cr add that amount to the balance
        if(at.getAccountNo() == am.getAccountNo()){
            if(at.getTranscationType().equalsIgnoreCase("cr")){
                am.setBalance(am.getBalance()+at.getAmount());
            }
        }



        //if the transaction type is db deduct that amount from the balance
        //after the deduction if the current balance is <1000 in comments column give message "minimum balance not maintained"

        if(at.getAccountNo() == am.getAccountNo()){
            if(at.getTranscationType().equalsIgnoreCase("dr")){
                int remainingBalance = am.setBalance(am.getBalance()-at.getAmount());
                if(remainingBalance<1000){
                    System.out.println("minimum balance not maintained");
                }
                else {
                    System.out.println("Balance Maintained");
                }
            }
        }

    }


}
