import java.util.ArrayList;
import java.util.List;

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter and Setter methods (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete methods for deposit and withdraw
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient amount for withdrawal!");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Annual interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan applied for amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Loan eligibility is 5x the balance
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan applied for amount: " + loanAmount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; // Loan eligibility includes overdraft limit
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        // List of accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Adding accounts to the list
        accounts.add(new SavingsAccount("SA123", "Alice", 5000, 3.5));
        accounts.add(new CurrentAccount("CA456", "Bob", 2000, 1000));

        // Process accounts
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            System.out.println("---------------");
            account.displayDetails();

            // Calculate interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            // Check loan eligibility if the account is loanable
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(5000);
            }

            System.out.println();
        }
    }
}
