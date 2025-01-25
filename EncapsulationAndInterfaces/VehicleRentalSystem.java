import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getter and Setter methods
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate + " per day");
    }
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Subclass Car
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    public Car(String vehicleNumber, double rentalRate, double insuranceRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceRate = insuranceRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate / 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential (Restricted Access)";
    }
}

// Subclass Bike
class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    public Bike(String vehicleNumber, double rentalRate, double insuranceRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insuranceRate = insuranceRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate / 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential (Restricted Access)";
    }
}

// Subclass Truck
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceRate = insuranceRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate / 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential (Restricted Access)";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicles to the list
        vehicles.add(new Car("C123", 1000, 10, "CAR-INS-001"));
        vehicles.add(new Bike("B456", 500, 5, "BIKE-INS-002"));
        vehicles.add(new Truck("T789", 2000, 15, "TRUCK-INS-003"));

        // Calculate and display rental and insurance details
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println("---------------");
            vehicle.displayDetails();

            int rentalDays = 5; // Example: Rent for 5 days
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                double insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }
        }
    }
}
