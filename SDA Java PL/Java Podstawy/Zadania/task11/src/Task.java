import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 1) {
            if (number == 2) {
                System.out.println("Tak");
            } else {
                for (int i = 2; i < number; i++) {
                    if (number%i == 0){
                        System.out.println("Nie");
                        break;
                    }
                    if (i == number-1) {
                        System.out.println("Tak");
                    }
                }
            }

        } else {
            System.out.println("Przerywam pracę");
        }
    }
}