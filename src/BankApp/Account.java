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
        if (amount <= 0) {
            throw  new IllegalArgumentException("Deposit amount must be greater than zero");
        }
        else balance += amount;
    }


    public int checkBalance(String pin) {
        if (pinIsCorrect(pin)) return balance;
        return 0;
    }

    private boolean pinIsCorrect(String pin) {
        return  this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {
        if (amount <= 0){throw  new IllegalArgumentException("Invalid withdraw amount");}
        if (amount > balance){
            throw  new IllegalArgumentException("Insufficient funds");
        }
        else if (pinIsCorrect(pin)) balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
