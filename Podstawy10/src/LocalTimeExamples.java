import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeExamples {
    public static void main(String[] args) {

        // current time
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalTime localTimeOf = LocalTime.of(12,12);
        System.out.println("localTimeOf = " + localTimeOf);

        // current date
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalDate localDateOf1 = LocalDate.of(2020,9,8);
        System.out.println("localDateOf1 = " + localDateOf1);
        LocalDate localDateOf2 = LocalDate.of(2020, Month.SEPTEMBER,8);
        System.out.println("localDateOf2 = " + localDateOf2);

        //current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTimeOf1 = LocalDateTime.of(2021,Month.MARCH,12,21,0,0,10);
        System.out.println("localDateTimeOf1 = " + localDateTimeOf1);

        LocalDateTime fiveDaysFromNow = localDateTime.plusDays(5);   //plusYears, plusMonths, plusHours, minusHours
        System.out.println("fiveDaysFromNow = " + fiveDaysFromNow);

        LocalDateTime localDateTimeWithZeroSeconds = localDateTime.withSecond(0).withNano(0);
        System.out.println("localDateTimeWithZeroSeconds = " + localDateTimeWithZeroSeconds);

        LocalDate localDateFromLDT = localDateTime.toLocalDate();
        System.out.println("localDateFromLDT = " + localDateFromLDT);
        LocalTime localTimeFromLDT = localDateTime.toLocalTime();
        System.out.println("localTimeFromLDT = " + localTimeFromLDT);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimePlus5Minutes = LocalDateTime.now().plusMinutes(5);

        boolean isBefore5MinutesIntoFuture = localDateTimeNow.isBefore(localDateTimePlus5Minutes);
        System.out.println("isBefore5MinutesIntoFuture = " + isBefore5MinutesIntoFuture);

        boolean isAfter5MinutesIntoFuture = localDateTimeNow.isAfter(localDateTimePlus5Minutes);
        System.out.println("isAfter5MinutesIntoFuture = " + isAfter5MinutesIntoFuture);

    }
}
