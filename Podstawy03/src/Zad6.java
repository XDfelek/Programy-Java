import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj x");
        int x = scanner.nextInt();
        System.out.println("podaj y");
        int y = scanner.nextInt();
        System.out.println("podaj a");
        int a = scanner.nextInt();
        System.out.println("podaj b");
        int b = scanner.nextInt();
        System.out.println("podaj c");
        int c = scanner.nextInt();

        int rownanie = a*(x*x) + b*y + c;
        System.out.println("wynik rownania = " + rownanie);

    }
}
