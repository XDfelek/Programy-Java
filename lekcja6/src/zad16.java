import java.util.Scanner;

public class zad16 {
//16. Do programu na wejściu dostajemy: liczbę przypadków testowych oraz trzy liczby
// c[liczba metrów kwadratowych płótna], k[pojemność samochodu], w[waga jednej paczki płótna].
// Na każdy metr kwadratowy przypada jedna paczka, która waży w kg. Maksylamnie w samochodzie możemy zabrać k kg.
//    Program wypisuje "wystarczy"/"nie wystarczy", jeżeli możliwe jest utworzenie całego płótna przy
//    użyciu pojedynczego przejazdu samochodu.
//            Przykład:
//    Wejście:
//            3
//            5 15 3
//            1 5 4
//            13 25 2
//    Wyjście:
//    wystarczy
//            wystarczy
//    nie wystarczy
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("podaj liczbę przypadków, które chcesz przetestować a następnie w następnej lini po spacji podaj" +
            "\n c - liczbe metrow kwadratowych plotna " +
            "\n k - pojemnosc samochodu" +
            "\n w - waga jednej paczki");
    int liczbaPrzypadkow = scanner.nextInt();
    scanner.nextLine();
    int [] [] tablica = new int[liczbaPrzypadkow][3];
    for (int i=0; i<liczbaPrzypadkow; i++){
        String pozostaleDane = scanner.nextLine();
        String [] tablicaDanych = pozostaleDane.split(" ");
        int c = Integer.parseInt(tablicaDanych[0]);
        int k = Integer.parseInt(tablicaDanych[1]);
        int w = Integer.parseInt(tablicaDanych[2]);
        tablica[i] = new int[]{c, k, w};
    }
    for (int i=0; i<liczbaPrzypadkow;i++){
        int c=tablica[i][0];
        int k=tablica[i][1];
        int w=tablica[i][2];
        if (c*w<=k){
            System.out.println("wystarczy");
        }
        else{
            System.out.println("nie wystarczy");
        }
    }
}
}
