import java.util.ArrayList;
import java.util.List;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics Class
class Electronics extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Electronics(int productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Clothing(int productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate / 100;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

// Groceries Class
class Groceries extends Product {
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // List of Products
        List<Product> products = new ArrayList<>();

        // Adding products to the list
        products.add(new Electronics(1, "Laptop", 1000, 10, 18));
        products.add(new Clothing(2, "T-Shirt", 500, 20, 5));
        products.add(new Groceries(3, "Milk", 50, 5));

        // Calculate and display final prices
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("---------------");
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
                System.out.println("Tax: " + tax);
            }
            System.out.println("Final Price: " + finalPrice);
        }
    }
}
