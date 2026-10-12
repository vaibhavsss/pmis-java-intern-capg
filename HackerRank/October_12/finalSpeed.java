package HackerRank.October_12;

import java.util.Scanner;

public class finalSpeed {

    public static int calculateFinalSpeed(int initialSpeed, int acceleration, int braking) {
        int updatedSpeed = initialSpeed + acceleration;
        int finalSpeed = updatedSpeed - braking;

        return finalSpeed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialSpeed = sc.nextInt();
        int acceleration = sc.nextInt();
        int braking = sc.nextInt();

        int result = calculateFinalSpeed(initialSpeed, acceleration, braking);

        System.out.println(result);

        sc.close();
    }
}
