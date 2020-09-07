import java.util.Scanner;

public class zad8 {
    //Napisz program, który sprawdza, czy podany string jest palindromem - czyli czy czytany od przodu i od
    // tyłu jest taki sam.
    //Przykładowe palindromy: Anna, Radar, Rotator, My gym, Step on no pets, Top spot, WOW, Repaper
    public static void main(String[] args) {
        System.out.println("podaj wyraz a ja sprawdzę czy jest palindromem");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        StringBuilder sb = new StringBuilder(tekst);
        if (tekst.equals(sb.reverse().toString())){
            System.out.println("podany wyraz jest palindromem");
        }
        else {
            System.out.println("podany wyraz nie jest palindromem");
        }

    }
}