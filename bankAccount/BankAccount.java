import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int numOfAccounts = 0;
    private static double totalAmount = 0;


    // constructor
    public BankAccount(double checkingParam, double savingsParam) {
        this.checkingBalance = checkingParam;
        this.savingsBalance = savingsParam;
        this.accountNumber = generateAccountNumber();
        numOfAccounts += 2;
        this.totalAmount = checkingBalance + savingsBalance;
    }


    public static double accountTotal() {
        return numOfAccounts;
    }
    public static double totalAmountOfMoney() {
        return totalAmount;
    }


    // getters and setters
    public double getYourCheckingBalance() {
        return this.checkingBalance;
    }
    public double getYourSavingsBalance() {
        return this.savingsBalance;
    }


    // class methods
    public void checkingDeposit(double amount) {
        // this.checkingBalance.add(amount);
        this.checkingBalance += amount;
    }
    public void savingsDeposit(double amount) {
        // this.savingsBalance.add(amount);
        this.savingsBalance += amount;
    }
    public void checkingWithdraw(double amount) {
        if (amount > this.checkingBalance) {
            System.out.println("Insufficient funds.");
        } else {            
            this.checkingBalance -= amount;
            System.out.println("Thank you for withdrawing. Your checking balance is: " + this.checkingBalance);
        }
    }
    public void savingsWithdraw(double amount) {
        if (amount > this.savingsBalance) {
            System.out.println("Insufficient funds");
        } else {
            this.savingsBalance -= amount;
            System.out.println("Thank you for withdrawing. Your savings balance is: " + this.savingsBalance);
        }
    }
    public String getCheckingBalance() {
        return "Your checking balance is: " + this.checkingBalance;
    }
    public String getSavingsBalance() {
        return "Your savings balance is: " + this.savingsBalance;
    }


    // Ninja bonuses
    public String getRandomNumber() {
        Random randomNumber = new Random();
        String nums = "1234567890";
        String[] number = new String[10];

        for(int i = 0; i < 10; i++) {
            number[i] = String.valueOf(nums.charAt(i));
        }
        return number[randomNumber.nextInt(10)];
    }
    private String generateAccountNumber() {
        String privateAccountNumber = "";

        for(int i=0; i < 10; i++) {
            privateAccountNumber += getRandomNumber();
        }
        return privateAccountNumber;
    }

}