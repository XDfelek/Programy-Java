import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameAndLastNameExtractor {
    public static void main(String[] args) {
        // Text: "Imie: <imie>, nazwisko: <nazwisko>"
        Pattern compile = Pattern.compile("Imie: (.*), Nazwisko: (.*)");
        Matcher matcher = compile.matcher("Imie: Kamil, Nazwisko: Wal");

        while(matcher.find()){
            System.out.println("matcher.group(0) = " + matcher.group(0));
            System.out.println("matcher.group(1) = " + matcher.group(1));
            System.out.println("matcher.group(2) = " + matcher.group(2));

            System.out.println(matcher.group(1) + " " + matcher.group(2));
        }
    }
}
