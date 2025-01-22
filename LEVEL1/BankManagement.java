package LEVEL1;
import java.util.*;

 class Account {
    private String accountNumber;
    private double balance;
    private Customer customer;
    private Bank bank;

    public Account(String accountNumber, double balance, Customer customer, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bank getBank() {
        return bank;
    }

    // Additional methods such as deposit and withdraw can be added here
}

 class Bank {
    private String name;
    private Map<String, Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists.");
        } else {
            Account newAccount = new Account(accountNumber, initialBalance, customer, this);
            accounts.put(accountNumber, newAccount);
            customer.addAccount(newAccount);
            System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " with balance " + initialBalance + ".");
        }
    }

    public double getAccountBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return 0.0;
        }
    }

    // Additional getters and methods can be added here
}
 class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Balance for account " + accountNumber + " is " + account.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public String getName() {
        return name;
    }

    // Additional getters and methods can be added here
}
public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");
        Customer customer = new Customer("John Doe");

        bank.openAccount(customer, "123456", 1000.0);
        customer.viewBalance("123456");
    }
}
