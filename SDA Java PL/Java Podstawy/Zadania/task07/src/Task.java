import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int potega = 0;
        int liczbaDoPotegi = 1;
        double wynik = 0;
        while(wynik<n){
            if (potega>0){
                liczbaDoPotegi = 2;
                wynik = Math.pow(liczbaDoPotegi, potega);
                if (wynik>n){
                    break;
                }
                System.out.println((int)wynik);
                potega++;
            }else{
                System.out.println(liczbaDoPotegi);
                potega++;
            }
        }

    }
}