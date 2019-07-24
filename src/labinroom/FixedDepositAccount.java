
package labinroom;


public class FixedDepositAccount extends BankAccount {
//construtor

    private FixedDepositAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    public static FixedDepositAccount createFixedDepositAccount(int accountNo, String accountName, double balance) {
        if (balance >= 100) {
            return new  FixedDepositAccount(accountNo, accountName, balance);
        } else {
            return null;
        }

    }

    @Override
    void deposit(double amount) {
        System.out.println("Deposit = "+amount); 
        double temp1 = getBalance() - amount;
        if (temp1 < 100){
            System.out.println("ไม่สามารถถอนเงินได้ คุณมียอดคงเหลือ = "+temp1);
        }else {
            setBalance(temp1);
        }
    }
    

}

