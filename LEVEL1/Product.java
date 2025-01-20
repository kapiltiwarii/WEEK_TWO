package LEVEL1;

public class Product {
    // Static variable shared across all products
     static double discount = 0.0;  // Discount percentage

    // Final variable for product ID, assigned once and cannot be changed
     final int productID;

    // Instance variables for product details
     String productName;
     double price;
     int quantity;

    // Constructor to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;  // Assigning to the final variable
        this.productName = productName;  // Using 'this' to resolve ambiguity
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to calculate and display the final price after discount
    public void displayProductDetails() {
        if (this instanceof Product) {
            double finalPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: " + price);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: " + finalPrice);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("The object is not an instance of Product.");
        }
    }

    // Main method to demonstrate the features
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product(101, "Laptop", 1000.0, 2);
        Product product2 = new Product(102, "Smartphone", 500.0, 5);

        // Displaying product details before applying discount
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Updating the discount
        Product.updateDiscount(10.0);  // 10% discount

        // Displaying product details after applying discount
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
