package October_8;

import java.util.*;

class Bank {
    double balance;

    // Constructor
    public Bank(double initialBalance) {
        balance = initialBalance;
        System.out.println("Available balance: " + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }
// 
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class bankConstructor {

    public static void main(String[] args) {

        Bank b1 = new Bank(150000.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nDo you want to deposit or withdraw money?");
            System.out.println("Enter 'deposit' or 'withdraw'");
            System.out.println("Enter 'exit' to stop");

            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {

                case "deposit":
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = scanner.nextDouble();

                    b1.deposit(depositAmount);

                    scanner.nextLine(); // consume Enter
                    break;

                case "withdraw":
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();

                    b1.withdraw(withdrawAmount);

                    scanner.nextLine(); // consume Enter
                    break;

                case "exit":
                    System.out.println("Thank you for using the bank system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}