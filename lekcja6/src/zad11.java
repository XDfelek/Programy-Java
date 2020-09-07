import java.util.Scanner;

public class zad11 {
    //11. Napisz program, który zlicza ilość takich samych znaków, które występują obok siebie w podanym stringu.
    // Przykładowo:
    //"abcXXXabc" -> 1
    //"xxxabyyyycd" -> 2
    //"a" -> 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz a ja podam ci ile razy takie same znaki w nim występują");
        String wyraz = scanner.nextLine();
char[] tablica = wyraz.toCharArray();
int suma=0;
for (int i=0; i<tablica.length-1; i++){
    int koniecPetli=0;
    System.out.println(i);
    if (tablica[i] == tablica[i+1]){

        for (int j=i+1; j<tablica.length; j++){
            if (tablica[j]!=tablica[i]){
                i=j-1;
                break;
            }
            koniecPetli=j;
        }

        suma=suma+1;
    }
    if (koniecPetli==tablica.length-1)
        break;
}
       System.out.println(suma);
    }
}
// dla przypadku aaabbbccc
// i=0 --> warunek - prawda -> j=1 --> warunek - fałsz, j=2 --> warunek fałsz, j=3 --> warunek prawda --> i=2
// iteracja i, i=3, --> warunek - prawda --> j=4 --> warunek - fałsz, j=5 --> warunek -fałsz, j=6 --> warunek - prawda, i=5;
// iteracja i, i=6 -- > warunek - prawda --> j=7 --> fałsz, j=8 - fałsz. koniec pętli j.
// iteracja i, i=7 --> warunek - prawda --> j=8 --> fałsz