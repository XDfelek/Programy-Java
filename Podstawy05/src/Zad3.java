import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj dlugosc tablicy int");
        int dlugoscTablicy = sc.nextInt();
        int[] tab = new int[dlugoscTablicy];
        System.out.println("Podawaj wartosci");

        for (int i = 0; i < tab.length; i++) {
            int value = sc.nextInt();
            tab[i] = value;
            System.out.println();

        }

        int suma = 0;
        int iloczyn = 1;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("[" + i + "] = " + tab[i]);
            suma += tab[i];
            iloczyn = iloczyn * tab[i];
            if (i == tab.length - 1) {
                System.out.println("suma = " + suma);
                System.out.println("iloczyn = " + iloczyn);
            }
        }

    }
}

