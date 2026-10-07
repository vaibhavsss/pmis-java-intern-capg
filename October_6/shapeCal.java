package October_6;
import java.util.*;

public class shapeCal {
    public static void main(String[]args){
        // program to calculate areas of triangle, square and rectangle using switch case
        double area;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: 1 for triangle, 2 fo Square, 3 for rectangle");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the base and height of triangle");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                System.out.println("Area of triangle is: " + area);
                break;

            case 2:
                System.out.println("Enter the side of square");
                double side = sc.nextDouble();
                area = side * side;
                System.out.println("Area of square is: " + area);
                break;
            case 3:
                System.out.println("Enter the length & breadth of the rectangle: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = length * breadth;
                System.out.println("Area of the rectangle is: " + area);
                break;
            }
    }
}
