package October_26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/* Formatting (Object to String):
When sending data back in a JSON response to a frontend or an external API,
you often need to convert dates into custom, human-readable strings (like 26-10-2026 or 10/26/2026).
*/
public class formatingDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // You define a pattern using DateTimeFormatter.ofPattern(...) and call .format() on your date object.
        // // 2: Define how you want the string to look
        // 'EEEE' = full day name, 'MMMM' = full month name
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm");

        // 3: Convert the object into a formatted String
        String formattedString = now.format(formatter);

        // Printing the outputs
        System.out.println("Original date: " + now);
        System.out.println("Formatted String: " + formattedString);
    }
}
