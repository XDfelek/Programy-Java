import java.util.Scanner;

public class PorownywanieTekstu {
    /*zad 13
     Napisz prosty program, którego zadaniem jest zgadywanie hasła. Po 3 błędnych próbach wyświetl odpowiedni komunikat.
     Hasło powinno być zapisane na stałe w programie (do porównywania hasła użyj metody `equals` z klasy String).
     */

    public static void main(String[] args) {
        for(int i = 0; i<3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("podaj haslo: ");
            String haslo = scanner.nextLine();
            System.out.println("podane haslo: " + haslo);
            boolean hasloJestRowne = "123".equals(haslo);

            if (hasloJestRowne) {
                //System.out.println("haslo jest poprawne");
                break;

            } else {

                System.out.println("ZLE HASLO");

                if (i==2){

                    System.out.println("Zle haslo podane trzy razy, wypad");
                }
            }
        }

    }
}
