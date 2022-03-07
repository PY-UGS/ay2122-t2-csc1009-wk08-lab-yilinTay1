package wk08_Lab.Question1;

import java.lang.Math;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) {
        this.radius = radius;
    }

    // Design the method to get the radius of the circle.
    public double getRadius() {
        return this.radius;
    }

    // Design the method to set the radius of the circle
    public void setRadius(double radius) throws IllegalArgumentException{
        // if the radius is not a positive number, an IllegalArgumentException should be
        // thrown.
        if (radius < 0)
            throw new IllegalArgumentException("Radius is not a positive number");
        this.radius = radius;
    }

    // Design the method to get the area of the circle.
    public double getArea() throws Exception {
        double areaCalculated = Math.PI * Math.pow(this.radius, 2);
        // If the area is bigger than 1000, a general exception “Exception” should be
        // thrown.
        if (areaCalculated > 1000)
            throw new Exception("Area is bigger than 1000");
        return areaCalculated;
    }

    // Design the method to get the diameter of the circle
    public double getDiameter() {
        return (this.radius * 2);
    }
}