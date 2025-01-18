public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;  // Class variable shared among all instances

    // Constructor to initialize product details and increment totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total products when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 699.99);

        // Displaying details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Displaying total number of products created
        Product.displayTotalProducts();
    }
}
