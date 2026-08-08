import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main1 {

    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDateTime date1 = LocalDateTime.of(2025, 5, 21, 10, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2026, 8, 8, 14, 2, 0);

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }

        System.out.println(date1);
        System.out.println(date2);
    }
}
