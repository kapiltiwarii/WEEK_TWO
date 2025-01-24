class Employee {
    protected String name;
    protected String id;
    protected int salary;
    // constructor
    public Employee(String name,String id,int salary){
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
   // Method to display details
    public void displayDetails(){
        System.out.println("Name: "+name+" id: "+id+" Salary: "+salary);
    }
}

//Subclass Manager
class Manager extends Employee{
    private int teamSize;
    // constructor
    public Manager(String name,String id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}

//Subclass Developer
class Developer extends Employee{
    private String programmingLanguage;
    //constructor
    public Developer(String name,String id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

//Subclass Intern
class Intern extends Employee{
    private String university;
    //constructor
    public Intern(String name, String id, int salary,String university) {
        super(name, id, salary);
        this.university=university;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("University: "+university);
    }
}
// Main class to test Hierarchy
public class EmployeeManagement{
    public static void main(String[] args) {
        // Create objects for each employee type
        Employee manager = new Manager("Mohan", "0111it61", 75000, 10);
        Employee developer = new Developer("Kalpesh", "0111it53", 50000, "java");
        Employee intern = new Intern("Kanha", "0111it82", 25000, "TIT");

        // Display details of each employee
        System.out.println("Manager details");
        manager.displayDetails();

        System.out.println("Developer details");
        developer.displayDetails();

        System.out.println("Intern Details");
        intern.displayDetails();
    }
}