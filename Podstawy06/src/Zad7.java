
// Napisz program, który wypisuje X wyrazów ciągu fibonacciego w odwróconej kolejności.

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb z ciągu fibonacciego chcesz zobaczyc w odwroconej kolejnosci");
        int liczba = scanner.nextInt();
        int[] ciagFibonacciego = new int[liczba];
        if (liczba == 1) {
            ciagFibonacciego[0] = 1;
        }

        if (liczba >= 2) {
            ciagFibonacciego[0] = 1;
            ciagFibonacciego[1] = 2;

            for (int i = 0; i < ciagFibonacciego.length; i++) {

                if (i == 0 || i == 1) {
                    continue;
                }
                ciagFibonacciego[i] = ciagFibonacciego[i-2] + ciagFibonacciego[i-1];

            }
        }

        for (int i = 0; i < ciagFibonacciego.length/2; i++){
            int tempLenght = ciagFibonacciego.length - (i+1);
            int temp = ciagFibonacciego[i];
            ciagFibonacciego[i] = ciagFibonacciego[tempLenght];
            ciagFibonacciego[tempLenght] = temp;
        }
        for (int wyswietl : ciagFibonacciego){
            System.out.print(wyswietl + "\t");
        }
    }
}
