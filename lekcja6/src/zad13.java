import java.util.Scanner;

public class zad13 {
    // Napisz program, który dla danego tekstu sprawdza najdłuższe, ciągłe wystąpienie litery.
    // Przykładowo dla teksu: `aaabbbbaaadddbbaaeee` będzie to 4, bo litera `b` występuje 4 razy w sposób ciągły.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz a ja podam ci ile razy takie same znaki w nim występują");
        String wyraz = scanner.nextLine();
        char[] tablica = wyraz.toCharArray();
        int maxsuma=0;
        for (int i=0; i<tablica.length-1; i++){
            int koniecPetli=0;
            int suma=0;
//            System.out.println("i= " + i);
            if (tablica[i] == tablica[i+1]){

                for (int j=i; j<tablica.length-1; j++){

//                    System.out.println("j= " + j);
                    suma=suma+1;
                    if (j==tablica.length-2){
                        suma=suma+1;
                    }
//                    System.out.println("suma = " + suma);
                    if (tablica[j]!=tablica[j+1]){
                        i=j;
                        break;
                    }
                    koniecPetli=j;
                }
if (suma>maxsuma){
    maxsuma=suma;
}
//                System.out.println("maxsuma = " + maxsuma);
            }
            if (koniecPetli==tablica.length-2)
                break;
        }
       System.out.println(maxsuma);

    }
}