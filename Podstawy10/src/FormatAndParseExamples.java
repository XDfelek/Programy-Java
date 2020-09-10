import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatAndParseExamples {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        String isoLocalDateFormat = DateTimeFormatter.ISO_LOCAL_DATE.format(now);
        System.out.println("isoLocalDateFormat = " + isoLocalDateFormat);
        String isoLocalTimeFormat = DateTimeFormatter.ISO_LOCAL_TIME.format(now);
        System.out.println("isoLocalTimeFormat = " + isoLocalTimeFormat);

        String isoLocalDateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(now);
        System.out.println("isoLocalDateTimeFormat = " + isoLocalDateTimeFormat);

        DateTimeFormatter polishDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String polishCurrentDate = polishDateFormat.format(now);
        System.out.println("polishCurrentDate = " + polishCurrentDate);

        String date = "11-12-2025";
        LocalDate parsedDate = LocalDate.parse(date,polishDateFormat);
        System.out.println("parsedDate = " + parsedDate);

        DateTimeFormatter customTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
        String customTimeFormatted = customTimeFormat.format(now);
        System.out.println("customTimeFormatted = " + customTimeFormatted);


    }
}
