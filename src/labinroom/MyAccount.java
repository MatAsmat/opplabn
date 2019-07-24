package labinroom;

public class MyAccount {

    public static void main(String[] args) {
//        BankAccount ba = new BankAccount(101, "Asmat", 1000);
//        ba.printDetails();
//
//        ba.deposit(1000);
//        ba.printDetails();
//
//        ba.withdraw(200);
//        ba.printDetails();

        SavingAccount sv = SavingAccount.createSavingAccount(102, "Asmat", 1000);
        if (sv != null) {
            sv.printDetails();
            sv.withdraw(900);
            sv.printDetails();
        } else {
            System.out.println("เปิดบัญชีขั้นต่ำ 100 บาท");
        }
    
        FixedDepositAccount fd =FixedDepositAccount.createFixedDepositAccount(103, "Asmat", 1000);
        if (sv != null) {
            sv.printDetails();
            sv.deposit(900);
            sv.printDetails();
        } else {
            System.out.println("เปิดบัญชีขั้นต่ำ 1000 บาท");
        }
    }

}
