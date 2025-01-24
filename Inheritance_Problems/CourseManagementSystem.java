// Base class Course
class Course {
    protected String courseName;
    protected int duration; // Duration in weeks

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass OnlineCourse
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded; // True if the course is pre-recorded

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding displayDetails() to include online course attributes
    @Override
    public void displayDetails() {
        super.displayDetails(); // Display basic course details
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount as a percentage

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate final price after discount
    public double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }

    // Overriding displayDetails() to include fee and discount
    @Override
    public void displayDetails() {
        super.displayDetails(); // Display online course details
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }
}

// Main class to test the hierarchy
public class CourseManagementSystem {
    public static void main(String[] args) {
        // Create a Course object
        Course basicCourse = new Course("Mathematics Fundamentals", 8);
        System.out.println("Basic Course Details:");
        basicCourse.displayDetails();
        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 6, "Coursera", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayDetails();
        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Data Science", 10, "Udemy", true, 199.99, 20);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayDetails();
    }
}
