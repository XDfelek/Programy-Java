import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj dlugosc tablicy int");
        int dlugoscTablicy = sc.nextInt();
        int[] tab = new int[dlugoscTablicy];
        System.out.println("Podawaj wartosci ale parzyste i wieksze od 5 ");

        for (int i = 0; i < tab.length; i++) {
            int value = sc.nextInt();
            if (value % 2 == 0 && value > 5) {
                tab[i] = value;
            }else{
                System.out.println("zła wartosc, podaj jeszcze raz");
                i--;
            }
            System.out.println();

        }

        int suma = 0;
        int iloczyn = 1;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("[" + i + "] = " + tab[i]);
            if (tab[i] % 2 == 0 && tab[i] > 5) {
                suma += tab[i];
                iloczyn = iloczyn * tab[i];
            }
            if (i == tab.length - 1) {
                System.out.println("suma = " + suma);
                System.out.println("iloczyn = " + iloczyn);
            }
        }

    }
}