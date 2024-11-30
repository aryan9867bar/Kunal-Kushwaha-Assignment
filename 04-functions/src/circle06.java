// 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;
public class circle06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);
        System.out.printf("Circumference of the circle: %.2f%n", circumference);
        System.out.printf("Area of the circle: %.2f%n", area);
    }
    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
