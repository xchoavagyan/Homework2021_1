package com.company;

public class Triangle {
//    3
//    Design a class named Triangle (Եռանկյուն)
//    properties
//    - sideA
//    - sideB
//    - sideC
//
//            methods
//    - calculatePerimeter
//    - calculateArea

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {

        if (isValidTriangle()) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }


    public boolean isValidTriangle() {

        boolean isValid = false;
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            isValid = true;
        }
        return isValid;
    }

    public double calculatePerimeter() {

        return this.sideA + this.sideB + this.sideC;
    }

    public double calculateArea() {

        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - sideC));

    }


}
