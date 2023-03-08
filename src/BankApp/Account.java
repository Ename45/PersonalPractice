package BankApp;

public class Account {
    private int balance;
    private String pin;
    private int accountNumber;
    private String accountName;

    public Account(int accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;

    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            throw  new IllegalArgumentException("Deposit amount must be greater than zero");
        }
    }


    public int checkBalance(String pin) {
        if (pinIsCorrect(pin)) return balance;
        return 0;
    }

    private boolean pinIsCorrect(String pin) {
        return  this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {
        if (amount <= 0){
            throw  new IllegalArgumentException("Cannot withdraw an amount that is zero or less ");
        }
        if (amount <= balance){
            if (pinIsCorrect(pin)) balance -= amount;
        }
        else throw  new IllegalArgumentException("Insufficient funds. Broke a**");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
