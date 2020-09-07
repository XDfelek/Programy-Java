import java.util.Arrays;
import java.util.Scanner;

public class zad10 {
    //10. Napisz program, który dla podanego stringa zlicza ilość słów, które kończą się na `y` lub `z`.
    public static void main(String[] args) {
        System.out.println("podaj tekst a ja podam ci ile słów kończy się na y lub z");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
String [] tablica = tekst.split(" ");
        int suma=0;
        for (int i=0; i<tablica.length; i++){
            int iloscZnakow = tablica[i].length();
            if (tablica[i].charAt(iloscZnakow-1)=='y' || tablica[i].charAt(iloscZnakow-1)=='z'){
                suma=suma+1;
            }
        }
        System.out.println("jest to " + suma + " słów");
    }
}
