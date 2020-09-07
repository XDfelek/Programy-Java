
// Napisz program, który znajduje X-ty wyraz ciągu fibonacciego. Sprawdź jak obliczamy ciąg fibonacciego. Zachowaj wszystkie poprzednie wyrazy w tablicy.

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ktora liczbe fibonacciego chcesz znać");
        int liczba = scanner.nextInt();
        int[] ciagFibonacciego = new int[liczba];
        if (liczba == 1) {
            ciagFibonacciego[0] = 1;
        }

        if (liczba >= 2) {
            ciagFibonacciego[0] = 1;
            ciagFibonacciego[1] = 2;

            for (int i = 0; i < ciagFibonacciego.length; i++) {

                if (i == 0 || i == 1)
                    continue;
                int temp = i - 1;
                int temp2 = temp - 1;
                ciagFibonacciego[i] = ciagFibonacciego[temp] + ciagFibonacciego[temp2];

            }
        }

        System.out.println(ciagFibonacciego[liczba - 1]);

    }
}
