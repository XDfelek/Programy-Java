import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int suma;
        double srednia;
        int min = 0;
        int max =0;
        do{
            number = scanner.nextInt();
            if (number>max){
                max = number;
            }
            if (number<min){
                min = number;
            }

        }while (number != 0);
        suma = min + max;
        srednia = (double)(min+max)/2;
        System.out.println(suma);
        System.out.println(srednia);
    }
}