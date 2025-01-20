package LEVEL1;

public class Employee {
    static String companyName = "Capgemini";

    String name;
    final String id;
    String designation;

    static int totalEmployee = 0;

    // Constructor to initialise the details of employee
    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    //method to return total employee
    static int displayTotalEmployee() {
        return totalEmployee;
    }


    //Method to display Employee details
    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company name :"+companyName);
            System.out.println("Name :" + name);
            System.out.println("Id :" + id);
            System.out.println("designation :" + designation);
        } else {
            System.out.println("This is not an instance of Book class");
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kapil", "IT-53", "Analytic engineer");
        Employee employee2 = new Employee("Kalpesh", "IT-50", "Senior Analytic");

        //Displaying the Employee details by calling the function using objects
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
        System.out.println("Total employees :"+Employee.totalEmployee);

        //Changing the company name
        Employee.companyName = "Bridz Labz";
        //Again displaying the details
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();



    }
}