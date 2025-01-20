package LEVEL1;

public class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "Global Bank";

    // Static variable to keep track of the total number of accounts
    static int totalAccounts = 0;

    // Final variable for account number, assigned once and cannot be changed
    final int accountNumber;

    // Instance variable for the account holder's name
    String accountHolderName;

    // Constructor to initialize the account details
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;  // Using 'this' to resolve ambiguity
        this.accountNumber = accountNumber;
        totalAccounts++;  // Increment the total number of accounts
    }

    // Static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("The object is not an instance of BankAccount.");
        }
    }

    // Static method to change the bank name (if needed)
    public static void setBankName(String newBankName) {
        bankName = newBankName;
    }

    // Main method to demonstrate the features
    public static void main(String[] args) {
        // Creating two BankAccount objects
        BankAccount account1 = new BankAccount("Kapil Tiwari", 1001);
        BankAccount account2 = new BankAccount("Kalpesh", 1002);

        // Displaying the details of each account
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Displaying the total number of accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

    }
}
