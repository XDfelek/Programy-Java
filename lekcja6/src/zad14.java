import java.util.Arrays;
import java.util.Scanner;

public class zad14 {
    //14. Zaimplementuj program, który zamienia litery w podanym tekście na drukowane (zarówno korzystając jak
    // i NIE korzystając z metody toUpperCase()). Przykładowo:
    //"to Jest przykladowy TEKST 123 :)" -> "TO JEST PRZYKLADOWY TEKST 123 :)"
    public static <StrinBuilder> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst a ja zamienię go na wielkie literu");
        String tekst = scanner.nextLine();
// metoda toUpperCase:
String wielkimiLiterami = tekst.toUpperCase();
        System.out.println(wielkimiLiterami);
        // metoda - kod ASCII:
        StringBuilder sb = new StringBuilder();
        String nowytext="";

char [] tablica = tekst.toCharArray();
        char[] nowaTablica = new char [tablica.length];
for (int i=0; i<tablica.length;i++){
    if ((int)tablica[i]>=97 && (int)tablica[i]<=122){      // przypadek jeśli litera jest mała - zamieniamy na dużą
        char[] tablicaChar = Character.toChars((int)tablica[i]-32);
        nowaTablica[i] = tablicaChar[0];
    }
    else {
        nowaTablica[i] = tablica[i];   // przypadek jeśli litera jest duża (wtedy nie zamieniamy)
    }
    if ((int)tablica[i]==32){             // przypadek jeśli występuje spacja
        nowytext=sb.append(tablica[i]).toString();
    }
    else {                                    // przypadek jeśli spacja nie występuje
        nowytext=sb.append(nowaTablica[i]).toString();
    }
}
        System.out.println(nowytext);
    }
}
