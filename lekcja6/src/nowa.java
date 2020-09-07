import java.util.Arrays;
import java.util.Locale;

public class nowa {
    public static void main(String[] args) {
      char cudzyslow = '"';
        System.out.println(cudzyslow);
        System.out.println("to jest cudzysłów: \"");
        // \ - daje to, że najbliższy znak traktujemy nie jako znak specjalny ale jako tekst - przyklad powyzej
        System.out.println("\\");
        int[] tablica= new int [4];
        System.out.println(Arrays.toString(tablica));
        System.out.println("\"To jest mój string\".substring(3) = " + "To jest mój string".substring(3));
        // metoda inter - przenosi stringa z obszaru pamięci do string poola
        int wiek=27;
        String name = "Kamil";
        String zawod = "Trener";
        double pensja = 10.0;
        String format = "Person: %s, wiek: %d, zawód: %s, pensja: %.4f";
        String wypelniony = String.format(format, name, wiek, zawod, pensja);
        System.out.println(wypelniony);
        String wypelniony2 = String.format(format, name, wiek, zawod, pensja);
        System.out.printf(Locale.ENGLISH, format, name, wiek, zawod, pensja);
    }
}
