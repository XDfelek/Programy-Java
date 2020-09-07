import java.util.Scanner;

public class zad17 {
    //17. Napisz program, który sprawdza czy podany string zawiera tylko cyfry.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text a ja sprawdze czy sa w nim same cyfry");
        String podanyString = scanner.nextLine();
        char[] tablica = podanyString.toCharArray();
        boolean czyMaCyfry = false;
        for (char c : tablica) {
            czyMaCyfry = ((int) c >= 48 && (int) c <= 57) || (int) c == 32;
        }
        if (czyMaCyfry){
            System.out.println("podany string posiada same cyfry");
        }
        else {
            System.out.println("podany string nie posiada samych cyfr");
        }
    }
}
