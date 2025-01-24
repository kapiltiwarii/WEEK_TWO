// Superclass Person
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role-specific details
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role-specific details
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display role-specific details
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Staff, Department: " + department);
    }
}

// Main Class
public class SchoolSystem {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Sumit", 42, "Mathematics");
        Student student = new Student("Mohan", 16, "10th Grade");
        Staff staff = new Staff("Rahul", 40, "Administration");

        // Display details for each role
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
