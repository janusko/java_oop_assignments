public class BankAccountTest {
    public static void main(String[] arg) {


        BankAccount account1 = new BankAccount(5760.32, 1240.54);
        BankAccount account2 = new BankAccount(37711.56,107299.04);
        BankAccount account3 = new BankAccount(1.0, 4.0);

        System.out.println(account1.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());

        account1.checkingDeposit(239.68);
        System.out.println(account1.getCheckingBalance());

        account1.checkingWithdraw(239.68);
        System.out.println(account1.getCheckingBalance());

        System.out.println(account3.getSavingsBalance());
        account3.savingsWithdraw(100.12);
        System.out.println(account3.getSavingsBalance());

    }
}