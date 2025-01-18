public class BankAccountManagement {
    // BankAccount class
    public static class BankAccount {
        // Public field
        public String accountNumber;

        // Protected field
        protected String accountHolder;

        // Private field
        private double balance;

        // Constructor
        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Public method to get the balance
        public double getBalance() {
            return balance;
        }

        // Public method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Public method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Invalid withdraw amount.");
            }
        }
    }

    // SavingsAccount subclass
    public static class SavingsAccount extends BankAccount {
        // Constructor for SavingsAccount
        public SavingsAccount(String accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        // Method to display account details
        public void displayAccountDetails() {
            // Accessing public field from superclass
            System.out.println("Account Number: " + accountNumber);

            // Accessing protected field from superclass
            System.out.println("Account Holder: " + accountHolder);

            // Accessing private field using getter method
            System.out.println("Balance: " + getBalance());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Alice Johnson", 5000.00);

        // Display account details using method in SavingsAccount class
        savingsAccount.displayAccountDetails();

        // Use public methods to modify and access the balance
        savingsAccount.deposit(1500.00);
        System.out.println("After deposit, balance: " + savingsAccount.getBalance());

        savingsAccount.withdraw(2000.00);
        System.out.println("After withdrawal, balance: " + savingsAccount.getBalance());

        // Attempting to withdraw more than the balance
        savingsAccount.withdraw(5000.00);
    }
}
