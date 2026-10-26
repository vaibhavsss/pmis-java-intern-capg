package October_26;
/*
When a client (like a frontend app or Postman) sends a date payload to your backend,
 it arrives as raw text inside an HTTP request (e.g., "25-12-2026 18:45:00").
To do any meaningful logic with this text—like checking if it's in the future
 or adding days to it—you must parse that string into a manipulable Java LocalDateTime object.
 The formatter acts as a rulebook telling Java how to read the string.
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class parsingDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (format: dd-MM-yyyy): ");
        String inputString = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // 2. Parse the String into a LocalDate Java object
            LocalDate parsedDate = LocalDate.parse(inputString, formatter);

            System.out.println("\n--- Success! ---");
            System.out.println("Parsed Java Object: " + parsedDate);
            System.out.println("Day of the week: " + parsedDate.getDayOfWeek());
            System.out.println("Year: " + parsedDate.getYear());

        } catch (DateTimeParseException e) {
            // 3. Gracefully handle bad input (e.g., typing "32-13-2026" or "abc")
            System.out.println("\n[Error] Invalid format or date! Please use dd-MM-yyyy.");
        } finally {
            sc.close();
        }
    }
}
