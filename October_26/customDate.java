package October_26;

import java.time.*;

public class customDate {
    public static void main(String[] args) {

        // code for printing our custom date
        LocalDate now = LocalDate.now();
//        LocalDate customDate = LocalDate.of(2026,7, 17);
//        System.out.println(customDate);

        int dayOfMonth = now.getDayOfMonth();
        int month = now.getMonthValue();
        int year = now.getYear();

        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

    }
}
