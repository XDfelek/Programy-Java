import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz tekst");
        String tekst = scanner.nextLine();
        System.out.println("wpisz numer znaku który mam odczytać");
        int numerZnaku = scanner.nextInt();
        if (numerZnaku<tekst.length()){
            System.out.println(tekst.charAt(numerZnaku));
        }
        else {
            System.out.println("index " + numerZnaku + " nie istnieje");
        }
    }
}
