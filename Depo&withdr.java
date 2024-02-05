

class Account {
    private double balance;

    // Default constructor
    public Account() {
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //deposit amount to the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    // to withdraw amount
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an account object using default constructor
        Account account1 = new Account();
        account1.displayBalance();

        // Create an account obj using parameterized constructor
        Account account2 = new Account(1000.0);
        account2.displayBalance();

        // Deposit  to account1
        account1.deposit(500.0);
        account1.displayBalance();

        // Withdraw from account2
        account2.withdraw(200.0);
        account2.displayBalance();
    }
}