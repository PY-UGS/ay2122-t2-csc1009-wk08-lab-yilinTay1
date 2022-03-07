package wk08_Lab.Question1;

import java.util.*;

public class Circle {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double userRadius = myObj.nextDouble(); // Read user input

        CircleWithException circle = new CircleWithException(1);

        try {
            circle.setRadius(userRadius);
            System.out.println("The radius is " + circle.getRadius());
            System.out.println("The area is " + circle.getArea());
            System.out.println("The diameter is " + circle.getDiameter());

        } catch (IllegalArgumentException e) {
            System.out.println("Caught-Number format issue: " + e);
        } catch (Exception e) {
            System.out.println("Caught:" + e);
        }
    }
}