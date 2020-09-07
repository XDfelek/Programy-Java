import java.util.Scanner;

public class zad15 {
    //15. Napisz program, który przyjmuje Twoje imię i nazwisko, a następnie wypisuje Twoje inicjały.
    //Przykładowo:
    //"Jakub Nowak" -> "J. N."
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj mi imię i nazwisko a ja podam ci Twoje inicjały");
        String godnosc = scanner.nextLine();
        char[] tablica = godnosc.toCharArray();
        String pierwszaLitera = Character.toString(tablica[0]).toUpperCase() + ". ";
        String drugaLitera = "";
        for (int i=0; i<tablica.length;i++){
            if (tablica[i]==' ') {
                drugaLitera = Character.toString(tablica[i+1]).toUpperCase() + ".";
            }
        }
        String inicjaly=pierwszaLitera+drugaLitera;
        System.out.println("Twoje inicjaly to: " + inicjaly);


    }
}
