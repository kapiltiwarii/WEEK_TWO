public class UniversityManagementSystem {

    public static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        // Constructor to initialize student details
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        // Public method to get CGPA
        public double getCGPA() {
            return CGPA;
        }

        // Public method to set CGPA
        public void setCGPA(double CGPA) {
            if (CGPA >= 0.0 && CGPA <= 10.0) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
            }
        }

        // Method to display student details
        public void displayStudentDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        }
    }

    public static class PostgraduateStudent extends Student {

        private String thesisTitle;

        // Constructor to initialize postgraduate student details
        public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
            super(rollNumber, name, CGPA);
            this.thesisTitle = thesisTitle;
        }

        // Method to display postgraduate student details
        public void displayPostgraduateStudentDetails() {
            displayStudentDetails();  // Call to the superclass method
            System.out.println("Thesis Title: " + thesisTitle);
        }
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Alice", 9.2);
        student1.displayStudentDetails();

        // Modifying CGPA using public methods
        student1.setCGPA(8.5);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(102, "Bob", 8.7, "Machine Learning in Healthcare");
        pgStudent1.displayPostgraduateStudentDetails();
    }
}
