// Superclass Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display basic vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private int cargoCapacity; // In tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test the hierarchy
public class VehicleSystem {
    public static void main(String[] args) {
        // Create an array of Vehicle type
        Vehicle[] vehicles = new Vehicle[3];

        // Populate the array using a for loop
        for (int i = 0; i < vehicles.length; i++) {
            if (i == 0) {
                vehicles[i] = new Car(200, "Petrol", 5);
            } else if (i == 1) {
                vehicles[i] = new Truck(120, "Diesel", 15);
            } else if (i == 2) {
                vehicles[i] = new Motorcycle(180, "Petrol", true);
            }
        }

        // Display details of each vehicle using a for loop
        for (int i = 0; i < vehicles.length; i++) {
            if (i == 0){
                System.out.println("Car Details");
                vehicles[i].displayInfo();
        } else if (i==1) {
                System.out.println("Truck Details");
                vehicles[i].displayInfo();
            } else if (i==3) {
                System.out.println("Motorcycle Details");
                vehicles[i].displayInfo();
            }

        }
    }
}
