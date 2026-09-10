import java.util.Scanner;

public class Circle {
    public static void main(String [] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        try {
        double area = area(radius);
        System.out.println("The area is: " + area);
        } catch(Exception e) {
            System.out.println("ERROR: Radius cannot be negative. Try again.");
        }
    }

    // Exercise: Change this method so that it throws an exception if any of the inputs are negative
    public static double rectangleArea(double width, double height) {
        if(width < 0 || height < 0) {
            throw new RuntimeException("width or height are negative");
        } 
        return width * height;
    }
    public static double boxArea(double width, double length, double height) {
        if(width < 0 || length < 0 || height < 0) {
        throw new RuntimeException("width or length or height are negative");
        }
        return width * length * height;
    }

    public static double area(double radius) {
        if(radius >= 0) {       
        return Math.PI * radius * radius;
        } else {
            throw new NegativeRadiusException();
        }
    }
}
