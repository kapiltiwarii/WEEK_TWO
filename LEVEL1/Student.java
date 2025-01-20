package LEVEL1;

import java.sql.Struct;

public class Student {
    static String universityName="Tit";
    String name;
    final String rollNumber;
    char grade;

    static int totalStudents = 0;
    // Constructor to initialise student details
    Student(String name,String rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    // Method to display total Students
    static int displayTotalStudent(){
        return totalStudents;
    }

    // Method to display student details
    void displayStudentDetail(){
        if (this instanceof Student){
            System.out.println("University Name :"+universityName);
        System.out.println("Name :"+name);
        System.out.println("Roll Number :"+rollNumber);
        System.out.println("Grade :"+grade);
        }
    }

    public static void main(String[] args) {
        // Two objects are created
        Student s1 = new Student("Mohan Agarwal","0111it83",'A');
        Student s2 = new Student("Aman ","0111it0",'B');

        //Method is calling using objects
        s1.displayStudentDetail();
        s2.displayStudentDetail();
        Student.displayTotalStudent();
    }

}
