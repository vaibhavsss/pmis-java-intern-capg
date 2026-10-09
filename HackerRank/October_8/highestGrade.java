package HackerRank.October_8;

import java.util.Scanner;

public class highestGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0, maxMarks = -1, maxIndex = 0;
        boolean failed = false;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();

            if (marks[i] < 35) {
                failed = true;
            }

            if (marks[i] > maxMarks) {
                maxMarks = marks[i];
                maxIndex = i + 1;
            }

            total += marks[i];
        }

        double pct = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%\n", pct);

        if (failed) {
            System.out.println("Result: Fail");
        } else if (pct >= 85) {
            System.out.println("Distinction");
        } else if (pct >= 70) {
            System.out.println("First Class");
        } else if (pct >= 60) {
            System.out.println("Second Class");
        } else if (pct >= 50) {
            System.out.println("Pass Class");
        } else {
            System.out.println("Pass");
        }

        System.out.println("Highest Scoring Subject: Subject " + maxIndex);

        sc.close();
    }
}