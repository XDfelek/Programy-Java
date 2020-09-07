import java.util.Scanner;

public class Zad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ilosc miejsc w tabeli");
        int dlugosc = scanner.nextInt();

        String[] stringTable = new String[dlugosc];

        String text = scanner.nextLine();
        String connected = "";
        for (int i = 0; i< stringTable.length; i++){
            System.out.println("uzupełnij " + (i+1) + " miejsce w tabeli stringow");
            stringTable[i] = scanner.nextLine();
            connected = new StringBuilder(connected).append(stringTable[i]).toString();
        }

        System.out.println("connected = " + connected);
    }
}
