package com.company;

public class Rectangle {
//            2
//            Design a class named Rectangle
//                properties
//                - height
//                - width
//
//                methods
//                - calculatePerimeter
//                - calculateArea

    private int height;
    private int width;


    public double calculatePerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public double calculateArea() {
        double area = height * width;
        return area;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }

    }
}