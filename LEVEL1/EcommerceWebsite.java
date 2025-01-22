package LEVEL1;

import java.util.ArrayList;
import java.util.List;

class ECommercePlatform {
    private List<Customers> customers;
    private List<Product> products;
    private List<Order> orders;

    public ECommercePlatform() {
        customers = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addCustomer(Customers customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private Customers customer;
    private List<Product> products;

    public Order(Customers customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        customer.placeOrder(this);
    }

    public Customers getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

public class EcommerceWebsite {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform();

        // Create customers
        Customers customer1 = new Customers("Alice");
        Customers customer2 = new Customers("Bob");

        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Add customers and products to platform
        platform.addCustomer(customer1);
        platform.addCustomer(customer2);
        platform.addProduct(product1);
        platform.addProduct(product2);
        platform.addProduct(product3);

        // Create and place orders
        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product3);

        Order order2 = new Order(customer2);
        order2.addProduct(product2);
        order2.addProduct(product3);

        platform.addOrder(order1);
        platform.addOrder(order2);

        // Display orders
        for (Order order : platform.getOrders()) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Products in the order:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + ": $" + product.getPrice());
            }
            System.out.println("Total Price: $" + order.getTotalPrice());
            System.out.println();
        }
    }
}
