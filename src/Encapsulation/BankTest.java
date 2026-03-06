package Encapsulation;

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(500);

        account.displayBalance();
    }
}
