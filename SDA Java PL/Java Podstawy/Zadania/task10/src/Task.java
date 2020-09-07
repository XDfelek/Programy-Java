import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();

        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.println(i);
            }
        }
    }
}