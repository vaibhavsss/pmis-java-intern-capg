package HackerRank.October_9;

import java.util.Scanner;

public class employeeRecord {

    public static int calculateSalary(int basicSalary, int allowance, int deduction) {
        return basicSalary + allowance - deduction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basicSalary = sc.nextInt();
        int allowance = sc.nextInt();
        int deduction = sc.nextInt();

        int result = calculateSalary(basicSalary, allowance, deduction);

        System.out.println(result);

        sc.close();
    }
}
