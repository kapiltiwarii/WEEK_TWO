import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    // method to display the results
    void displayResults(double area, double circumference) {
        System.out.println("Area :" + area);
        System.out.println("Circumference" + circumference);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        double radius = input.nextDouble();
        Circle resCircle = new Circle(radius);

        double area = resCircle.calculateArea();
        double circumference = resCircle.calculateCircumference();

        resCircle.displayResults(area, circumference);

        input.close();

    }
}
