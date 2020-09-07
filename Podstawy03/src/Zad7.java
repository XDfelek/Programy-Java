import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba%3==0 && liczba%7==0){
            System.out.println("liczba jest podzielna przez 3 i 7");
        }else if (liczba%3==0){
            System.out.println("liczba jest podzielna przez 3");
        }else if (liczba%7==0){
            System.out.println("liczba jest podzielna przez 7");
        }
    }
}
