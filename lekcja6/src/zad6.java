import java.util.Arrays;
import java.util.Scanner;

public class zad6 {
    //6. Napisz program, który odwraca stringa (użyj metod: `toCharArray`, `charAt` oraz klasy `StringBuilder`).

    public static void main(String[] args) {

        System.out.println("podaj stringa a ja go odwrócę");
        Scanner scanner = new Scanner(System.in);
        String doOdwrocenia = scanner.nextLine();
        String nowyString ="";
        String nowyString2="";
        String nowyString3="";

        // wersja toCharArray
        char[] tablica = doOdwrocenia.toCharArray();
        for (int i=0; i<tablica.length/2;i++){
            char temp = tablica[tablica.length-1-i];
            tablica[tablica.length-1-i]=tablica[i];
            tablica[i]=temp;
        }
        for (int i=0;i<tablica.length;i++){
            nowyString = nowyString + tablica[i];
        }
        System.out.println(nowyString);
        //wersja charAt
        for (int i=doOdwrocenia.length()-1;i>=0;i--){
            nowyString2=nowyString2+doOdwrocenia.charAt(i);
        }
        System.out.println(nowyString2);
        //wersja stringBuilder
        StringBuilder sb = new StringBuilder(doOdwrocenia);
        nowyString3=sb.reverse().toString();
        System.out.println(nowyString3);
    }
}
