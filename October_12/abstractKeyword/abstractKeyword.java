package October_12.abstractKeyword;
abstract class Shape{
    private String colour;

    void setColor(String colour){
        this.colour = colour;
    }

    String getcolor(){
        return colour;
    }
    abstract double findArea();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override 
    double findArea(){
        return (3.14)*radius*radius;    }
}

class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double findArea(){
        return length * breadth;
    }
}
public class abstractKeyword {
    public static void main(String[] args) {
        Shape c = new Circle(0.5);
        Shape r = new Rectangle(12, 6);
        c.setColor("Orange");
        r.setColor("Blue");

        System.out.printf("%s Circle area is %.2f", c.getcolor(), c.findArea());
        System.out.println("\n");
        System.out.printf("%s Rectangle area is %.2f%n",r.getcolor(), r.findArea());
    }
}
