package October_26.Problems;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class meetingTimeAssistant {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

            LocalDate date = null;
            LocalTime time = null;
            long durationMinutes = 0;

            System.out.println("========== MEETING TIME ASSISTANT ==========\n");

            // 1. Get Meeting Date
            while (date == null) {
                System.out.print("Enter meeting date (yyyy-MM-dd): ");
                try {
                    date = LocalDate.parse(sc.nextLine(), dateFormatter);
                } catch (DateTimeException e) {
                    System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                }
            }

            // 2. Get Meeting Time
            while (time == null) {
                System.out.print("Enter meeting time (HH:mm): ");
                try {
                    time = LocalTime.parse(sc.nextLine(), timeFormatter);
                } catch (DateTimeException e) {
                    System.out.println("Invalid time format. Please use HH:mm.");
                }
            }

            // 3. Get Duration in Minutes
            System.out.print("Enter meeting duration in minutes: ");
            while (!sc.hasNextLong()) {
                System.out.println("Please enter a valid integer for duration.");
                sc.next();
            }
            durationMinutes = sc.nextLong();
            sc.nextLine();

            LocalDateTime startDateTime = LocalDateTime.of(date, time);

            int choice;
            do {
                System.out.println("\nChoose an option:");
                System.out.println("1. Display meeting date and time");
                System.out.println("2. Display meeting end time");
                System.out.println("3. Display meeting time in another zone");
                System.out.println("4. Check whether the meeting is in the future");
                System.out.println("5. Exit");
                System.out.print("\nEnter choice: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    sc.next();
                }
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\nMeeting starts at: " + startDateTime.format(displayFormatter));
                        break;
                    case 2:
                        LocalDateTime endDateTime = startDateTime.plusMinutes(durationMinutes);
                        System.out.println("\nMeeting starts at: " + startDateTime.format(displayFormatter));
                        System.out.println("Meeting ends at:   " + endDateTime.format(displayFormatter));
                        break;
                    case 3:
                        displayTimeZone(startDateTime, sc);
                        break;
                    case 4:
                        checkFutureMeeting(startDateTime);
                        break;
                    case 5:
                        System.out.println("Exiting Meeting Time Assistant. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 5.");
                }

            } while (choice != 5);

            sc.close();
        }

        public static void displayTimeZone(LocalDateTime startDateTime, Scanner sc) {
            System.out.print("Enter target Zone ID (e.g., America/New_York, Europe/London, Asia/Kolkata): ");
            String zoneIdStr = sc.nextLine();
            try {
                ZoneId targetZone = ZoneId.of(zoneIdStr);
                ZonedDateTime localZoned = startDateTime.atZone(ZoneId.systemDefault());
                ZonedDateTime targetZoned = localZoned.withZoneSameInstant(targetZone);

                DateTimeFormatter tzFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a z");
                System.out.println("Meeting time in " + targetZone + ": " + targetZoned.format(tzFormatter));
            } catch (Exception e) {
                System.out.println("Invalid Zone ID. Please use standard Zone IDs (e.g., UTC, America/New_York).");
            }
        }

        public static void checkFutureMeeting(LocalDateTime startDateTime){
            LocalDateTime now = LocalDateTime.now();
            if (startDateTime.isAfter(now)) {
                System.out.println("\nYes, this meeting is in the future.");
            } else {
                System.out.println("\nNo, this meeting is in the past or currently happening.");
            }
        }
    }
