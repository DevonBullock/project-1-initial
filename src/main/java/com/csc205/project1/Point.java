package com.csc205.project1;
/*In gemini I entered, "For Intellij, Design & implement a class called Point that represents a location in the Cartesian plane.
Include (at a minimum) the following methods:
A constructor that takes x and y coordinates as double arguments,
setX(double x), setY(double y),
getX(), getY(),
setPoint(double x, double y),
shiftX(double n), shiftY(double n),
distance(Point p2),
rotate(double angle),
Include a toString method as well as Any other methods you believe to be necessary."*/
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;
    }

    public double distance(Point p2) {
        double dx = x - p2.x;
        double dy = y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Additional methods for convenience:
    public Point add(Point p2) {
        return new Point(x + p2.x, y + p2.y);
    }

    public Point subtract(Point p2) {
        return new Point(x - p2.x, y - p2.y);
    }

    public Point multiply(double scalar) {
        return new Point(x * scalar, y * scalar);
    }

    public Point divide(double scalar) {
        return new Point(x / scalar, y / scalar);
    }
}
