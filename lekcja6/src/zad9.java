import java.util.Scanner;

public class zad9 {
    //9. Zdefiniuj kilka mapowań, np. "gwiazdka" -> *, "hash" -> #.
    // Napisz program, który dla podanego przez użytkownika w konsoli tekstu wyświetla symbol.
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String symbol = scanner.nextLine();
switch (symbol){
    case "gwiazdka":
        System.out.println("*");
        break;
    case "hash":
        System.out.println("#");
        break;
    case "procent":
        System.out.println("%");
        break;
    default:
        System.out.println("nie mam w bazie tego symbolu");
        break;
}
    }
}
