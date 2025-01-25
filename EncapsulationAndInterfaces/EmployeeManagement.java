import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private int employeeID;
    private String name;
    private double baseSalary;

    public Employee(int employeeID,String name,double baseSalary){
        this.employeeID=employeeID;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }

    abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeID+" Name: "+name+" baseSalary "+baseSalary);
    }
}

interface Department{
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
    private String department;
    private double bonus;

    FullTimeEmployee(int employeeID, String name, double baseSalary,double bonus) {
        super(employeeID, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department :"+department;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary()+bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000.0, 10000.0);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20000, 20, 100);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        // Process and display details of employees using a traditional for loop
        for (int i = 0; i < employees.size(); i++) {
            System.out.println();
            employees.get(i).displayDetails();
        }
    }
}
