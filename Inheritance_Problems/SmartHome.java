//Super class Devices
class Devices{
    protected int deviceID;
    protected String status;

    //Constructor
    public Devices(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }

    // Method to display status of the devices
    public void displayStatus(){
        System.out.println("Device ID: "+deviceID);
        System.out.println("Device status: "+status);
    }
}

//Subclass Thermostat
class Thermostat extends Devices{
    private double temperatureSetting;

    //Constructor
    public Thermostat(int deviceID, String status,double temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting=temperatureSetting;
    }

    // Method to display the temperature setting including device status of super class
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperatureSetting+"°C");
    }
}

// Main method to show single inheritance
public class SmartHome {
    public static void main(String[] args) {
        // Creating object of the thermostat class
        Devices thermostat = new Thermostat(12345, "On", 22.5);

        // Calling method display the status
        thermostat.displayStatus();
    }
}
