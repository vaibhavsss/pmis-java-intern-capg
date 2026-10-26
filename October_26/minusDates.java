package October_26;

import java.time.LocalDate;

public class minusDates {
    public static void main(String[] args) {
        // code to find the dates minus today's date
        LocalDate now = LocalDate.now();

        LocalDate yesterday = now.minusDays(1);
        LocalDate pastDate = now.minusWeeks(4);
        LocalDate oldDate = now.minusMonths(12);

        System.out.println(yesterday);
        System.out.println(pastDate);
        System.out.println(oldDate);

    }
}
