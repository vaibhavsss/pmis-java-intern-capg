package October_26;
/*
When a client (like a frontend app or Postman) sends a date payload to your backend,
 it arrives as raw text inside an HTTP request (e.g., "25-12-2026 18:45:00").
To do any meaningful logic with this text—like checking if it's in the future
 or adding days to it—you must parse that string into a manipulable Java LocalDateTime object.
 The formatter acts as a rulebook telling Java how to read the string.
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class parsingDates {
    public static void main(String[] args) {
        
    }
}
