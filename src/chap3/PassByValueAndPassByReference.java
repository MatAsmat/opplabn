//***Pass by Reference***//
package chap3;

class Account {

    private int accountId;
    private String accountName;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public int getAccountId() {//call getter
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {//call setter
        this.accountName = accountName;
    }

}//end class

public class PassByValueAndPassByReference {

    public static void changeDoubleValue(double newRate) {
        newRate = 3.75;
    }

    public static void changeobjectAttribute(Account actObj) {
        actObj.setAccountName("Asmat");
    }

    public static void main(String[] args) {
        double interestRate = 4.99;
        System.out.println("---Pass by Value---");
        System.out.println("Before calling method : interestRate = " + interestRate);
        changeDoubleValue(interestRate);
        System.out.println("After calling method : interestRate = " + interestRate);

        System.out.println("---Pass by Reference---");
        Account actObj = new Account(594234054, "No Name");
        System.out.println("Before calling method :");
        System.out.println("actObj =" + actObj);
        System.out.println("ID =" + actObj.getAccountId());
        System.out.println("Name =" + actObj.getAccountName());

        changeobjectAttribute(actObj);
        System.out.println("After calling method :");//pass by reference
        System.out.println("actObj =" + actObj);
        System.out.println("ID =" + actObj.getAccountId());
        System.out.println("Name =" + actObj.getAccountName());

    }
}//end class
