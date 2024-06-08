package com.mycompany.rectangle;
public class Rectangle {
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8.0, 5.0);
        System.out.println("Perimeter is: " + r1.calculatePerimeter() + ", Area is: " + r1.calculateArea());

        Rectangle r2 = new Rectangle(7.0, 4.0);
        System.out.println("Perimeter is: " + r2.calculatePerimeter() + ", Area is: " + r2.calculateArea());
    }
}


