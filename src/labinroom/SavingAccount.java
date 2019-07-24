package labinroom;

public class SavingAccount extends BankAccount {
//construtor

    private SavingAccount(int accountNo, String accountName, double balance) {
        super(accountNo, accountName, balance);
    }

    public static SavingAccount createSavingAccount(int accountNo, String accountName, double balance) {
        if (balance >= 100) {
            return new SavingAccount(accountNo, accountName, balance);
        } else {
            return null;
        }

    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdraw = "+amount); 
        double temp = getBalance() - amount;
        if (temp < 100){
            System.out.println("ไม่สามารถถอนเงินได้ คุณมียอดคงเหลือ = "+temp);
        }else {
            setBalance(temp);
        }
    }
    

}

