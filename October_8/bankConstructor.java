package October_8;
// Write a Java program. that uses a constructor to first print the available balance of a bank account and then ask user if they want to deposit or withdraw money. If they want to deposit, ask them how much and add that amount to the balance. If they want to withdraw, ask them how much and subtract that amount from the balance. Finally, print the updated balance.
import java.util.*;
class Bank{
    double balance;

    //Constructor
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
        System.out.println("Do you want to deposit or withdraw money? (Enter 'deposit' or 'withdraw')");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("deposit")) {
            System.out.println("Enter the amount to deposit:");
            double amount = scanner.nextDouble();
            b1.deposit(amount);
        } else if (choice.equals("withdraw")) {
            System.out.println("Enter the amount to withdraw:");
            double amount = scanner.nextDouble();
            b1.withdraw(amount);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
