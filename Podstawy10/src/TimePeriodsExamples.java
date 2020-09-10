import java.time.*;

public class TimePeriodsExamples {
    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2010,1,6,12,12);
        LocalDateTime end = LocalDateTime.of(2022, Month.NOVEMBER, 15,12,12);

        Duration between = Duration.between(start,end);
        System.out.println("between = " + between);
        long durationSeconds=between.toSeconds();
        System.out.println("durationSeconds = " + durationSeconds);
        long durationDays=between.toDays();
        System.out.println("durationDays = " + durationDays);
        long durationMinutes = between.toMinutes();
        System.out.println("durationMinutes = " + durationMinutes);

        LocalDate startLocalDate = start.toLocalDate();
        LocalDate endLocalDate = end.toLocalDate();

        Period.between(startLocalDate,endLocalDate);
        System.out.println("endLocalDate = " + endLocalDate);

        Period period = Period.between(startLocalDate,endLocalDate);
        System.out.println("period = " + period);

        int periodYears = period.getYears();
        System.out.println("periodYears = " + periodYears);
        int periodMonths = period.getMonths();
        System.out.println("periodMonths = " + periodMonths);

    }


}
