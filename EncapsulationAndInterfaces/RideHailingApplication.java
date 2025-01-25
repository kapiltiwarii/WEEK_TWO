// Abstract class representing a Vehicle
abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: $" + ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Getters for encapsulation (no setters to restrict modification)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

// Subclass for Car
class Cars extends Vehicles implements GPS {
    private String currentLocation;

    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass for Bike
class Bikes extends Vehicles implements GPS {
    private String currentLocation;

    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Subclass for Auto
class Autos extends Vehicles implements GPS {
    private String currentLocation;

    public Autos(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown"; // Default location
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Main class to demonstrate the Ride-Hailing Application
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating vehicles
        Vehicles car = new Cars("CAR123", "John Doe", 1.5);
        Vehicles bike = new Bikes("BIKE456", "Jane Smith", 0.8);
        Vehicles auto = new Autos("AUTO789", "Bob Brown", 1.0);

        // Updating and displaying GPS locations
        GPS carGPS = (GPS) car;
        carGPS.updateLocation("Downtown");
        System.out.println(car.getVehicleDetails());
        System.out.println("Current Location: " + carGPS.getCurrentLocation());
        System.out.println("Fare for 10 km: $" + car.calculateFare(10));

        System.out.println();

        GPS bikeGPS = (GPS) bike;
        bikeGPS.updateLocation("Airport");
        System.out.println(bike.getVehicleDetails());
        System.out.println("Current Location: " + bikeGPS.getCurrentLocation());
        System.out.println("Fare for 5 km: $" + bike.calculateFare(5));

        System.out.println();

        GPS autoGPS = (GPS) auto;
        autoGPS.updateLocation("City Center");
        System.out.println(auto.getVehicleDetails());
        System.out.println("Current Location: " + autoGPS.getCurrentLocation());
        System.out.println("Fare for 8 km: $" + auto.calculateFare(8));

        System.out.println();

        // Demonstrating polymorphism
        System.out.println("Calculating fares dynamically for various vehicles:");
        calculateFaresDynamically(new Vehicles[]{car, bike, auto}, new double[]{10, 5, 8});
    }

    // Method to calculate fares dynamically for various vehicles
    public static void calculateFaresDynamically(Vehicles[] vehicles, double[] distances) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getVehicleDetails());
            System.out.println("Fare for " + distances[i] + " km: $" + vehicles[i].calculateFare(distances[i]));
            System.out.println();
        }
    }
}
