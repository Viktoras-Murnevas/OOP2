package com.company;

public class Square extends Shape {

    private double side;

// Costructorius
    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatedPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
