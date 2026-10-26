package October_26.Problems;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class dateExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = null;

        // 1st requirement
        while (date == null) {
            System.out.println("Enter a Date (format yyyy-MM-dd): ");
            String input = sc.nextLine();
            try {
                date = LocalDate.parse(input);
            } catch (DateTimeException e) {
                System.out.println("Invalid Date");
            }
        }

        int choice;
        do {
            System.out.println("\n==============================================");
            System.out.println("              Date Explorer Menu                ");
            System.out.println("==============================================");
            System.out.println("1. Display Month");
            System.out.println("2. Display Year and Leap Year Status");
            System.out.println("3. Display Day of the week");
            System.out.println("4. Loop back by Months");
            System.out.println("5. EXIT");
            System.out.print("Choose an option (1-5): ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input.");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    displayMonth(date);
                    break;
                case 2:
                    displayYear(date);
                    break;
                case 3:
                    displayDayOfWeek(date);
                    break;
                case 4:
                    lookBackMonths(date, sc);
                    break;
                case 5:
                    System.out.println("Exiting Date Explorer. Goodbye!");
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    public static void displayMonth(LocalDate date) {
        System.out.println("\n------ Month Info -------");
        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Number: " + date.getMonthValue());
    }

    public static void displayYear(LocalDate date) {
        System.out.println("\n----- Year Information -----");
        int year = date.getYear();
        System.out.println("Year: " + year);
        if (date.isLeapYear()) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }

    public static void displayDayOfWeek(LocalDate date) {
        System.out.println("\n------ Day of Week -----");
        System.out.println("Day of week: " + date.getDayOfWeek());
    }

    public static void lookBackMonths(LocalDate date, Scanner scanner) {
        System.out.println("\n----- Look Back Months -----");
        System.out.print("Enter the number of months to look back: ");

        while (!scanner.hasNextLong()) {
            System.out.println("Please enter a valid integer for months: ");
            scanner.next();
        }
        long months = scanner.nextLong();
        scanner.nextLine();

        LocalDate pastDate = date.minusMonths(months);
        System.out.println("Original Date: " + date);
        System.out.println("Date " + months + " month(s) ago: " + pastDate);
    }
}