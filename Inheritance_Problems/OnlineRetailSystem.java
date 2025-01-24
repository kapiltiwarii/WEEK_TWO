// Base class Order
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the current order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", shipped with Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class to test the hierarchy
public class OnlineRetailSystem {
    public static void main(String[] args) {
        // Create an Order object
        Order order = new Order("ORD124", "2025-01-20");
        System.out.println("Order Status:");
        System.out.println(order.getOrderStatus());
        System.out.println();

        // Create a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-01-18", "TRK987654321");
        System.out.println("Shipped Order Status:");
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println();

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD124", "2025-01-15", "TRK987654321", "2025-01-22");
        System.out.println("Delivered Order Status:");
        System.out.println(deliveredOrder.getOrderStatus());
        System.out.println();

        // Display details for DeliveredOrder
        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}
