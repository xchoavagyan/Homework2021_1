package com.company;

public class Circle {
//            1
//            Design a class named Circle
//                properties
//                - radius
//
//                methods
//                - calculatePerimeter
//                - calculateArea

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
}
