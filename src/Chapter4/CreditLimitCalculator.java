package Chapter4;

public class CreditLimitCalculator {
    private long accountNumber;
    private double balance;

    private double itemsChargeForTheMonth;

    private double creditsAppliedForTheMonth;
    private double creditLimit;


    public CreditLimitCalculator(long accountNumber, double balance, double itemsChargeForTheMonth, double creditsAppliedForTheMonth, double creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.itemsChargeForTheMonth = itemsChargeForTheMonth;
        this.creditsAppliedForTheMonth = creditsAppliedForTheMonth;
        this.creditLimit = creditLimit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {

        while (balance < creditLimit) {
            balance += itemsChargeForTheMonth - creditsAppliedForTheMonth;
        }
        if (balance > creditLimit) System.out.println("Credit limit exceeded");
        return balance;
    }

}
