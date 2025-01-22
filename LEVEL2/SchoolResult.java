package LEVEL2;

import java.util.ArrayList;
import java.util.List;

// Subject Class
class Subject {
    private int subjectId;
    private String name;
    private int marks;

    public Subject(int subjectId, String name, int marks) {
        this.subjectId = subjectId;
        this.name = name;
        this.marks = marks;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

// Student Class
class Student {
    private int studentId;
    private String name;
    private List<Subject> subjects;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void requestGrade(GradeCalculator calculator) {
        String grade = calculator.calculateGrade(this);
        System.out.println("Grade for " + name + " (ID: " + studentId + "): " + grade);
    }
}

// GradeCalculator Class
class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = 0;

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
            subjectCount++;
        }

        if (subjectCount == 0) {
            return "No subjects available.";
        }

        int average = totalMarks / subjectCount;

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
}

// Main Class
public class SchoolResult {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
        student.addSubject(new Subject(101, "Maths", 90));
        student.addSubject(new Subject(102, "Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        student.requestGrade(calculator);
    }
}
