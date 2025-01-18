import java.util.Scanner;

public class Circle {
    double radius;
    // default constructor
    public Circle(){
        this.radius=2.0;
    }
    // Parameterised constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Circle : ");
        double radius = input.nextDouble();
        Circle defCircle=new Circle();
        Circle resCircle = new Circle(radius);

        System.out.println("Radius of circle 1 using default constructor: "+defCircle.radius);
        System.out.println("Radius of circle 2 using default constructor: "+resCircle.radius);
      

        input.close();

    }
}
