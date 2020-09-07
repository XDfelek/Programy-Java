import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*");
        Matcher matcher = pattern.matcher("Kamil");

        //zwraca true jak jakikolwiek kawalek pasuje do pattern
        boolean textContainsPattern = matcher.find();
        System.out.println("textContainsPattern = " + textContainsPattern);

        //zwraca true jak CALY tekst pasuje do pattern
        boolean matches = matcher.matches();
        System.out.println("matches = " + matches);
    }
}
