package com.company;

public class Point {
//    4
//    Design a class named Point (կետ)
//    properties
//    - coordinateX
//    - coordinateY
//
//            methods
//    - distance()  (from 0:0 coordinate)
//            - distance(Point point) ( Overloaded method to get the distance between 2 points )

    private int x;
    private int y;

    public Point(int x, int y) {
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }
    }

    public double distance() {

        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));

    }

    public double distance(Point point) {

        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 0) {
            this.x = x;
        }

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        }
    }
}
