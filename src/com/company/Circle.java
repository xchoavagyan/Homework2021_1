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


    public double calculatePerimeter() {
        double perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
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
