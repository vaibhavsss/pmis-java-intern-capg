import java.util.*;
public class JustPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        if (num1 > 0) {
            System.out.println("");
        } else if (num1 < 0) {
            System.out.println("num1 < 0");
        } else {
            System.out.println("The number is 0");
        }

        //System.out.print("A B C\nD E F\nG H I");
        //java.util.Scanner scanner = new java.util.Scanner(System.in);
        //String equation = scanner.nextLine();
        //System.out.println(name);
        //System.out.println("Your name is: \"" + name + "\"");

    }
}
