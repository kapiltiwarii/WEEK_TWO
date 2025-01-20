package LEVEL1;

public class Vehicle {
    static int registrationFee=10;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    // Constructor to initialise the details of vehicle
    Vehicle(String ownerName,String vehicleType,String registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }

    static void updateRegistrationFee(int newFee){
        registrationFee=newFee;
    }

    void displayDetailsOfVehicle(){
        if (this instanceof Vehicle) {
            System.out.println("Owner Name :" + ownerName);
            System.out.println("Vehicle Type :" + vehicleType);
            System.out.println("Registration Number :" + registrationNumber);
            System.out.println("Registration Fees :" + registrationFee);
        }
        else{
            System.out.println("This is not a instance of object");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Sanjay ","Motorcycle","CG25T0903");
        Vehicle vehicle2 = new Vehicle("Rohan ","Car","MP04T3000");

        vehicle1.displayDetailsOfVehicle();
        vehicle2.displayDetailsOfVehicle();

        Vehicle.updateRegistrationFee(20);

        vehicle1.displayDetailsOfVehicle();
        vehicle2.displayDetailsOfVehicle();

    }


}
