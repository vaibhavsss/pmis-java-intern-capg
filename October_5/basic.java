import java.util.*;
public class basic {
    public static void main(String[] args) {
        //take input in seconds and convert into hours, minutes and seconds

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        long tsec = sc.nextInt();
        long hours = (long)(tsec / 3600);
        long minutes = (long)(tsec % 3600) / 60;
        long seconds = (long)(tsec % 60);
        System.out.println("Time in hours: " + hours);
        System.out.println("Time in minutes: " + minutes);
        System.out.println("Time in seconds: " + seconds);
    }
}
