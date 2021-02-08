package com.company;

public class ShapeApplication {

    public static void main(String[] args) {

        Shape square = new Square(2);
        Shape circle = new Circle(3);

        System.out.println(square.calculateArea());
        System.out.println(square.calculatedPerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatedPerimeter());

    }
}
