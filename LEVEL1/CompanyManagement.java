package LEVEL1;
import java.util.ArrayList;
import java.util.List;
// Employee Class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department Class
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println(" - Employee: " + employee.getName());
        }
    }

    public String getDepartmentName() {
        return name;
    }
}

// Company Class
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void listDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.listEmployees();
        }
    }

    // Method to delete the company and associated departments
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear(); // Removing all departments which will clear employees as well
        departments = null;
    }}

public class CompanyManagement{
    public static void main(String[] args) {
        // Creating a company
        Company company = new Company("TechCorp");

        // Creating departments
        Department dept1 = new Department("Research");
        Department dept2 = new Department("Development");

        // Adding employees to departments
        dept1.addEmployee(new Employee("Alice"));
        dept1.addEmployee(new Employee("Bob"));
        dept2.addEmployee(new Employee("Charlie"));
        dept2.addEmployee(new Employee("Dave"));

        // Adding departments to company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Listing all departments and employees
        company.listDepartments();

        // Deleting the company to show composition effect
        company.deleteCompany();
    }
}

