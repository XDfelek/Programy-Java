import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rok do sprawdzenia czy jest przystepny");
        int rok = scanner.nextInt();
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("rok jest przystepny");
        } else {
            System.out.println("rok NIE jest przystepny");
        }
    }
}
