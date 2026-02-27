class BankAccount {
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(12345, 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}