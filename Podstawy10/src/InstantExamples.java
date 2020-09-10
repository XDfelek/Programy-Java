import java.time.Instant;
import java.util.Random;

public class InstantExamples {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

        System.out.println("instant.getNano() = " + instant.getNano());

        new Random(System.nanoTime());
    }

}
