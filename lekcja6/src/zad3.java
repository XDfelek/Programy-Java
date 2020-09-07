import java.util.Scanner;
//Napisz program, który przyjmuje dwa lub więcej stringów, a zwraca jeden string złożony z połączonych stringów.
public class zad3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyrazy a ja stworzę z niego stringa. Jak wpiszesz -1 zakończę stringa");
        String wyraz = "";
        String wyraz3 = "";
        while (!wyraz.equals("-1")) {
            wyraz = scanner.nextLine();
            if (!wyraz.equals("-1")) {
                wyraz3 = sb.append(wyraz).append(" ").toString();
            }
        }
        System.out.println(wyraz3);
    }

}
