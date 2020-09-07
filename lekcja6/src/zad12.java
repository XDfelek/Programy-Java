import java.util.Scanner;

public class zad12 {
    //12. Napisz program, który zlicza sumę cyfr występujących w stringu. Przykładowo:
    //"aa1bc2d3" -> 6
    //"aa11b33" -> 8
    //"Chocolate" -> 0
    //a**) zmodyfikuj powyższy program tak, aby zliczał liczby zamiast cyfr. Przykładowo:
    //"abc123xyz" -> 123
    //"aa11b33" -> 44
    //"7 11" -> 18
    public static <StrinBuilder> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz a ja zliczę symę cyfr jaka w nim występuje");
        String tekst = scanner.nextLine();
        int suma=0;
        int sumacyfr=0;
char[]tablica = tekst.toCharArray();
for (int i=0;i<tablica.length;i++){
    if ((int)tablica[i]>=48 && (int)tablica[i]<=57){
        sumacyfr=sumacyfr+Integer.parseInt(Character.toString(tablica[i]));
    }
}
StringBuilder sb = new StringBuilder();
        System.out.println("suma cyfr to " + sumacyfr);

        for (int i=0;i<tablica.length;i++){
            String liczba="";
            int koniecPetli=0;
            System.out.println(i);
            if ((int)tablica[i]>=48 && (int)tablica[i]<=57){
                for (int j=i; j<tablica.length;j++){
                    if ((int)tablica[j]>=48 && (int)tablica[j]<=57){
                        liczba=liczba+tablica[j];
                        koniecPetli=j;
                    }
                    else {
                        i=j-1;
                        break;
                    }
                }
                suma = suma + Integer.parseInt(liczba);
                if (koniecPetli==tablica.length-1){
                    break;
                }
            }
        }
        System.out.println(suma);
    }
}
