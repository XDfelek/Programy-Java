import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tempInCelcius = scanner.nextFloat();
        float tempInFahrenheit = (float) ((tempInCelcius * 1.8) + 32.0);
        System.out.println(tempInFahrenheit);
    }
}