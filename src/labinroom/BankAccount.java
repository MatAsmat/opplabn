package labinroom;

public class BankAccount {
//Attribute

    private int accountNo;
    private String accountName;
    private double balance;
//constructor

    public BankAccount(int accountNo, String accountName, double balance) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }
//getter and setter

    public int getAccount() {
        return accountNo;
    }

    public void setAccount(int account) {
        this.accountNo = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Method3
    void printDetails() {
        System.out.println("--------------------------------");
        System.out.println("Account No : " + accountNo);
        System.out.println("Account No : " + accountName);
        System.out.println("Account No : " + balance);
        System.out.println("--------------------------------");
    }

    //Method1
    void deposit(double amount) {
        System.out.println("Deposit Amount = " + amount);
        balance = balance + amount;
    }
//Method2

    void withdraw(double amount) {
        System.out.println("Withdraw Amount = " + amount);
        balance = balance - amount;
    }
}


 