import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTimeExamples {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/London");
        ZonedDateTime londonZoneDateTime = ZonedDateTime.now(zoneId);
        System.out.println("londonZoneDateTime = " + londonZoneDateTime);


    }

}
