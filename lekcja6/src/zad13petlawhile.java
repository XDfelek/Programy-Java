import java.util.Scanner;

public class zad13petlawhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz a ja podam ci ile razy takie same znaki w nim występują");
        String wyraz = scanner.nextLine();
        char[] tablica = wyraz.toCharArray();
        int i = 0;
        int j = i;
        int maxsuma = 0;

        while (tablica[i] == tablica[i + 1]) {
            int suma = 0;
//            System.out.println("i = " + i);
            while (tablica[j] == tablica[i]) {
//                    System.out.println("j = " + j);
                    suma = suma + 1;
//                    System.out.println("suma = " + suma);
                    if (j<tablica.length-1) {
                        j++;
                    }
                    else {
                        break;
                    }
            }
            if (tablica[j]!=tablica[i]){
                i=j-1;
            }
            if (suma>maxsuma){
                maxsuma=suma;
            }
            if (i < tablica.length-2)
                i++;
            else{
                break;
            }
        }
        System.out.println(maxsuma);
    }
}
