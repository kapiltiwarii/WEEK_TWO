package LEVEL1;

import java.util.ArrayList;
import java.util.List;

// Students Class
class Students {
    private String name;
    private List<Courses> enrolledCourses;

    public Students(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Courses course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println("Student " + name + " enrolled in course " + course.getCourseName());
        }
    }

    public void listCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Courses course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// Professor Class
class Professor {
    private String name;
    private List<Courses> taughtCourses;

    public Professor(String name) {
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    public void assignCourse(Courses course) {
        if (!taughtCourses.contains(course)) {
            taughtCourses.add(course);
            course.setProfessor(this);
            System.out.println("Professor " + name + " assigned to course " + course.getCourseName());
        }
    }

    public void listCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (Courses course : taughtCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// Courses Class
class Courses {
    private String courseName;
    private List<Students> students;
    private Professor professor;

    public Courses(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Students student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Students student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void showProfessor() {
        if (professor != null) {
            System.out.println("Course " + courseName + " is taught by Professor " + professor.getName());
        } else {
            System.out.println("Course " + courseName + " has no professor assigned yet.");
        }
    }
}

// Department Class
class Departments {
    private String departmentName;
    private List<Courses> courses;
    private List<Professor> professors;

    public Departments(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    // Add a course to the department
    public void addCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Course " + course.getCourseName() + " added to " + departmentName + " department.");
        }
    }

    // Add a professor to the department
    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
            System.out.println("Professor " + professor.getName() + " added to " + departmentName + " department.");
        }
    }

    // List all courses in the department
    public void listCourses() {
        System.out.println("Courses in " + departmentName + " department:");
        for (Courses course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    // List all professors in the department
    public void listProfessors() {
        System.out.println("Professors in " + departmentName + " department:");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }

    // Getter for department name
    public String getDepartmentName() {
        return departmentName;
    }
}

// University Class
class University {
    private String universityName;
    private List<Departments> departments;
    private List<Students> students;
    private List<Professor> professors;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addDepartment(Departments department) {
        if (!departments.contains(department)) {
            departments.add(department);
            System.out.println("Department " + department.getDepartmentName() + " added to " + universityName);
        }
    }

    public void addStudent(Students student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.getName() + " added to " + universityName);
        }
    }

    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
            System.out.println("Professor " + professor.getName() + " added to " + universityName);
        }
    }

    public void listDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Departments department : departments) {
            System.out.println("- " + department.getDepartmentName());
        }
    }

    public void listStudents() {
        System.out.println("Students in " + universityName + ":");
        for (Students student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public void listProfessors() {
        System.out.println("Professors in " + universityName + ":");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }

    public void closeUniversity() {
        System.out.println("Closing " + universityName + "...");
        departments.clear();  // Deleting the university deletes all departments
    }
}

// UniversityManagement Class to demonstrate the system
public class UniversityManagement {
    public static void main(String[] args) {
        University university = new University("Tech University");

        // Add departments
        Departments csDepartment = new Departments("Computer Science");
        Departments mechDepartment = new Departments("Mechanical Engineering");
        university.addDepartment(csDepartment);
        university.addDepartment(mechDepartment);

        // Create students and professors
        Students alice = new Students("Alice");
        Students bob = new Students("Bob");

        Professor drSmith = new Professor("Dr. Smith");
        Professor drJones = new Professor("Dr. Jones");

        // Add students and professors to the university
        university.addStudent(alice);
        university.addStudent(bob);
        university.addProfessor(drSmith);
        university.addProfessor(drJones);

        // Create courses
        Courses math = new Courses("Mathematics");
        Courses physics = new Courses("Physics");

        // Add courses to departments
        csDepartment.addCourse(math);
        mechDepartment.addCourse(physics);

        // Students enroll in courses
        alice.enrollCourse(math);
        bob.enrollCourse(physics);

        // Professors assign courses
        drSmith.assignCourse(math);
        drJones.assignCourse(physics);

        // Display information
        math.listStudents();
        math.showProfessor();

        physics.listStudents();
        physics.showProfessor();

        // List all departments, students, and professors
        university.listDepartments();
        university.listStudents();
        university.listProfessors();

        // Closing the university
        university.closeUniversity();
        university.listDepartments();  // Should show no departments
    }
}
