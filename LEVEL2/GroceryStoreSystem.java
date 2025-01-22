package LEVEL2;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double calculateCost() {
        return pricePerUnit * quantity;
    }

    public String getDetails() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Customer class
class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// BillGenerator class
class BillGenerator {
    private List<Product> products;

    public BillGenerator() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double generateBill(Customer customer) {
        System.out.println("Generating bill for customer: " + customer.getName());
        double totalAmount = 0;
        for (Product product : products) {
            System.out.println("Product: " + product.getDetails());
            totalAmount += product.calculateCost();
        }
        return totalAmount;
    }
}

// Main class to simulate the process
public class GroceryStoreSystem {
    public static void main(String[] args) {
        // Create customer
        Customer customer = new Customer("Alice");

        // Create BillGenerator instance
        BillGenerator billGenerator = new BillGenerator();

        // Add products to the bill
        billGenerator.addProduct(new Product("Apples", 3.0, 2)); // 2 kg at $3/kg
        billGenerator.addProduct(new Product("Milk", 2.0, 1));   // 1 liter at $2/liter

        // Generate the bill
        double totalBill = billGenerator.generateBill(customer);

        // Display total bill
        System.out.println("Total Bill Amount: $" + totalBill);
    }
}
