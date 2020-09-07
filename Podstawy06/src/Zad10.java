
//10. Napisz program, który tworzy kwadratową, dwuwymiarową tablicę (oba rozmiary są sobie równe),
// a następnie wypełnia ją liczbą -1, z wyjątkiem głównej przekątnej, gdzie wpisujemy 1.

import java.util.Arrays;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj bok kwadratu");
        int bok = scanner.nextInt();
        int[][] tabKwadrat = new int[bok][bok];
        for (int i = 0; i < tabKwadrat.length; i++) {
            int[] tab = tabKwadrat[i];

            for (int j = 0; j < tab.length; j++) {
                if (i == j) {
                    tabKwadrat[j][i] = 1;
                } else {
                    tabKwadrat[j][i] = 0;                   //zamienilem -1 na 0 dla lepszej przejrzystosci
                }
            }
        }

        for (int i = 0; i < tabKwadrat.length; i++) {
            int[] tabValue = tabKwadrat[i];
            System.out.println("tabValue = " + Arrays.toString(tabValue));
        }
    }
}
