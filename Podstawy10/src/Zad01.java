import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad01 {
    //1. Napisz metodę która przyjmuje tekst i zwraca true gdy tekst zawiera numer telefonu w formie XXX-YYY-ZZZ.
    //a) Zmodyfikuj powyższy program tak, by dodatkowo wypisywał numer telefonu na konsolę - jeśli jest obecny.
    //b) Zmodyfikuj powyższy program tak, aby zamieniał numer telefonu na XXX-YYY-ZZZ w
    // celu ochrony danych osobowych. Wypisz zmieniony tekst na konsolę.

    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(\\d\\d\\d-\\d\\d\\d-\\d\\d\\d)");
        Matcher matcher = compile.matcher("moim numerem telefonu jest 123-421-123 i czesto do mnie dzwonia z telemarketu");
        while (matcher.find()){
            System.out.println("matcher.group(0) = " + matcher.group(0));
            System.out.println("matcher.group(1) = " + matcher.group(1));


        }
    }
}
