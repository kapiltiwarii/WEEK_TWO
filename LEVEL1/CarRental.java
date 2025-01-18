public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static double dailyRate = 50.0;  // Fixed rate per day

    // Default constructor
    public CarRental() {
        this.customerName = "Kapil Tiwari";
        this.carModel = "Scorpio classic";
        this.rentalDays = 3;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Creating a rental using the parameterized constructor
        CarRental rental1 = new CarRental("Alice Johnson", "Toyota Corolla", 5);

        // Displaying rental details
        rental1.displayRentalDetails();

        // Creating another rental with default constructor and then setting details
        CarRental rental2 = new CarRental();

        // Displaying rental details
        rental2.displayRentalDetails();
    }
}
