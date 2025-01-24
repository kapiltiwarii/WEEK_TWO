// Superclass: Person
class Persons {
    protected String name;
    protected int id;

    // Constructor
    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display common details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // Abstract method to be implemented by subclasses
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties from Worker interface
    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Chef, Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing the kitchen.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Implement performDuties from Worker interface
    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Waiter, Section: " + section);
        System.out.println("Duties: Taking orders and serving food to customers.");
    }
}

// Main Class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create objects for Chef and Waiter
        Chef chef = new Chef("Gordon Ramsay", 101, "French Cuisine");
        Waiter waiter = new Waiter("John Doe", 201, "Section A");

        // Display duties for each role
        System.out.println("Restaurant Staff Details:");
        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}
