import java.util.Locale;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe readValue = " );
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
       double readValue = sc.nextDouble();
        System.out.println("readValue = " + readValue);
    }
}
