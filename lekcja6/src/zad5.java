import java.util.Scanner;

public class zad5 {
    //5. Napisz program, który przyjmuje liczby całkowite, a następnie zwraca łancuch znaków złożony
    // z tych liczb. (Wykorzystaj klasę StringBuilder oraz konkatenację znakiem +).
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczby całkowite a ja zrobię z nich łańcuch znaków. Zakończę dodawać jak wpiszesz -1");
        int liczba=0;
        String lancuchZnakow="";
        String lancuchZnakow2="";
        while(liczba!=-1) {
            liczba = scanner.nextInt();
            if (liczba != -1) {
                lancuchZnakow = sb.append(Integer.toString(liczba)).toString();
                lancuchZnakow2=lancuchZnakow2+Integer.toString(liczba);
            }
        }
        System.out.println("wersja string builder " + lancuchZnakow);
        System.out.println("wersja z + " + lancuchZnakow2);

    }
}
