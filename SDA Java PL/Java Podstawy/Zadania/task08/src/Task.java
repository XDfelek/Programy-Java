import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int i = 1;
        while(i != 0){
            i = scanner.nextInt();
            suma += i;
        }
        System.out.println(suma);
    }
}