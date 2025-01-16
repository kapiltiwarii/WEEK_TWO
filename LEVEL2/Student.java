package LEVEL2;

public class Student {
    String name ;
    String rollNumber;
    int marks;

    Student(String name,String rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    String calculateGrade(){
        if (marks>=80 && marks<=100) {
            return "A";
        }
        else if (marks>=70 && marks <80) {
            return "B";
        }
        else if (marks>=60 && marks<70) {
            return "C";
        }
        else
        return "D";
    }

    void displayGrade(String grade ){
        System.out.println("Name of Student: "+name);
        System.out.println("Roll Number of Student: "+rollNumber);
        System.out.println("Marks of Student: "+marks);
        System.out.println("Grade of Student: "+grade);
    }

    public static void main(String[] args) {
        Student result  = new Student("Kapil","0111IT211053",80);
        String grade = result.calculateGrade();
        result.displayGrade(grade);
    }
}
