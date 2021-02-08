package com.company;

public class Circle extends Shape {

    private double radius;

// Costructorius
    public Circle(double radius) {
        this.radius = radius;
    }

// Getter
    public double getRadius() {
        return radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * (radius / 2) * (radius / 2);
    }

    @Override
    double calculatedPerimeter() {
        return Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
