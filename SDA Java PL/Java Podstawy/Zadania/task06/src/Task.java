import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int suma = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                suma += i;
            }
            System.out.println(suma);
        }else{
            System.out.println("Robota skończona");
        }
    }
}