
package HackerRank.October_12;

import java.util.Scanner;

class Shape {
    protected String color;

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class shapesCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Shape circle = new Circle(radius);
        circle.setColor("Orange");

        Shape rectangle = new Rectangle(length, width);
        rectangle.setColor("Light Blue");

        System.out.printf(
            "Color: %s, Area: %.2f%n",
            circle.color,
            circle.calculateArea()
        );

        System.out.printf(
            "Color: %s, Area: %.2f%n",
            rectangle.color,
            rectangle.calculateArea()
        );

        sc.close();
    }
}
