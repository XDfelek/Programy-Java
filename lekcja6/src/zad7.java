import java.util.Scanner;

public class zad7 {
    //Napisz program, który zlicza ilość spółglosek i samogłosek (a, e, i, o, u, y)
    // w podanym przez użytkownika tekście.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("napisz jakiś tekst bez polskich znaków a ja zliczę samogłoski i spółgłoski");
        String tekst = scanner.nextLine();
        int sumaSamoglosek=0;
        int sumaSpolglosek=0;
        char[] tablica = tekst.toCharArray();
        for (int i=0; i<tablica.length;i++){
            if (tablica[i] == 'a'|| tablica[i] =='e'|| tablica[i] =='i'|| tablica[i] =='o'|| tablica[i] =='u'|| tablica[i] =='y'){
                sumaSamoglosek=sumaSamoglosek+1;
            }
            if (tablica[i]=='b'|| tablica[i] =='c'|| tablica[i] =='d'|| tablica[i] =='f'|| tablica[i] =='g'|| tablica[i] =='h'|| tablica[i] =='j' || tablica[i] =='k'|| tablica[i] =='l'|| tablica[i] =='m'|| tablica[i] =='n'|| tablica[i] =='p'|| tablica[i] =='r'|| tablica[i] =='s'|| tablica[i] =='t'|| tablica[i] =='w'|| tablica[i] =='x'|| tablica[i] =='z'){
                sumaSpolglosek=sumaSpolglosek+1;
            }
        }
        System.out.println("suma samoglosek = " + sumaSamoglosek);
        System.out.println("suma spolglosek = " + sumaSpolglosek);
    }
}
