// Pobierz od użytkownika liczbę całkowitą - rozmiar dwuwymiarowej tablicy kwadratowej (oba wymiary są sobie równe).
// Zaincjalizuj dwuelementową tablicę zmiennych typu double, a następnie wypełnij ją losowymi wartościami.
// Następnie program powinien stworzyć nową tablicę kwadratową o takich samych wymiarach jak
// tablica oryginalna i przepisać wartości z pierwszej tablicy do drugiej.
// Wprowadź zmiany w oryginalnej tablicy, a następnie wypisz zakres obu tablic na ekran.

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Zad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int rozmiar = sc.nextInt();

        Random random = new Random(System.currentTimeMillis());
        double[][] tablica = new double[rozmiar][rozmiar];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextDouble() * 10;
            }
        }

        double[][] kopia = new double[rozmiar][rozmiar];
        for (int i = 0; i < kopia.length; i++) {
            for (int j = 0; j < kopia[i].length; j++) {
                kopia[i][j] = tablica[i][j];
            }
        }
        tablica[random.nextInt(rozmiar)][random.nextInt(rozmiar)] = random.nextDouble() * 1000;
        tablica[random.nextInt(rozmiar)][random.nextInt(rozmiar)] = random.nextDouble() * 1000;

        System.out.println("tablica oryginalna = "+ Arrays.deepToString(tablica));
        System.out.println("tablica kopia = "+ Arrays.deepToString(kopia));


    }
}
//Klasa StringBuilder powinna być zasadniczo używana zamiast klasy StringBuffer,
// ponieważ obsługuje wszystkie te same operacje, ale jest szybsza, ponieważ nie wykonuje synchronizacji.