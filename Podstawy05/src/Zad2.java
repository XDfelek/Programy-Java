import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj dlugosc tablicy int");
        int dlugoscTablicy = sc.nextInt();
        int[] tab = new int[dlugoscTablicy];
        System.out.println("Podawaj wartosci");

        for (int i = 0; i < tab.length; i++){
            int value = sc.nextInt();
            tab[i] = value;
            System.out.println();

        }


        for (int i = 0; i < tab.length; i++){
            System.out.println("Forward = [" + i + "] = " + tab[i] );
        }

    }
}
/*
2. Napisz program, który pobiera od użytkownika rozmiar tablicy, a następnie wypełnia ją liczbami podanymi przez użytkownika.
 */