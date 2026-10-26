package October_26;

import java.time.*;

public class dTime {
    public static void main(String[] args) {
        // code to find today's date
        LocalDate now = LocalDate.now();
        System.out.println("Today's date is: "+ now);

        int dayOfMonth = now.getDayOfMonth();
        Month month =now.getMonth();
        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);
    }
}
