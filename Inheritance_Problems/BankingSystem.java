// Base class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance is " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance is " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }

    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal amount exceeds the limit of " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }

    public void displayMaturityDetails() {
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Example usage
public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S123", 5000, 3.5);
        savings.displayAccountType();
        savings.displayBalance();
        savings.calculateInterest();

        CheckingAccount checking = new CheckingAccount("C123", 2000, 500);
        checking.displayAccountType();
        checking.displayBalance();
        checking.withdraw(600); // Exceeds withdrawal limit
        checking.withdraw(400);

        FixedDepositAccount fixedDeposit = new FixedDepositAccount("F123", 10000, 12);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayBalance();
        fixedDeposit.displayMaturityDetails();
    }
}
