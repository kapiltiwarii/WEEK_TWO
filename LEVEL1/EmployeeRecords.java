public class EmployeeRecords {
    // Employee class
    public static class Employee {
        // Public field
        public String employeeID;

        // Protected field
        protected String department;

        // Private field
        private double salary;

        // Constructor
        public Employee(String employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        // Public method to get the salary
        public double getSalary() {
            return salary;
        }

        // Public method to modify the salary
        public void setSalary(double newSalary) {
            if (newSalary > 0) {
                salary = newSalary;
            } else {
                System.out.println("Salary must be positive.");
            }
        }
    }

    // Manager subclass
    public static class Manager extends Employee {
        // Constructor for Manager
        public Manager(String employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        // Method to display employee details
        public void displayEmployeeDetails() {
            // Accessing public field from superclass
            System.out.println("Employee ID: " + employeeID);

            // Accessing protected field from superclass
            System.out.println("Department: " + department);

            // Accessing private field using getter method
            System.out.println("Salary: " + getSalary());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of Manager
        Manager manager = new Manager("EMP12345", "HR", 75000.00);

        // Display employee details using method in Manager class
        manager.displayEmployeeDetails();

        // Modify the salary using public method
        manager.setSalary(80000.00);
        System.out.println("After salary update:");
        manager.displayEmployeeDetails();

        // Attempt to set a negative salary
        manager.setSalary(-5000.00);
    }
}
