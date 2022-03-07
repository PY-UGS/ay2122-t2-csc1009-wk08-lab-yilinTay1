package wk08_Lab.Question2;

public class CheckingAccount {
    // throws a user-defined exception InsufficientFundsException if amount to
    // withdraw is higher than the balance

    private double balance;
    private int accountNum;

    public CheckingAccount(double balance, int accountNum) {
        // balance and account number fields
        this.accountNum = accountNum;
        this.balance = balance;
    }
    // methods deposit(), withdraw(), getBalance(), getNumber().
    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) throws InsufficientFundsException {
        if (withdraw>this.balance) throw new InsufficientFundsException(this.balance-withdraw);
        this.balance -= withdraw;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.accountNum;
    }
}
