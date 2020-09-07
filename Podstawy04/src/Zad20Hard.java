import java.util.Scanner;

public class Zad20Hard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczbaPoczatkowa = scanner.nextInt();
        System.out.println("liczbaPoczatkowa = " + liczbaPoczatkowa);
        int liczbaKoncowa = 0;
        for (int i = 0; i == i; i++) {
            liczbaKoncowa += (liczbaPoczatkowa % 10);
            liczbaPoczatkowa = liczbaPoczatkowa / 10;
            if (liczbaPoczatkowa == 0) {
                break;
            }
            liczbaKoncowa = liczbaKoncowa * 10;
        }
        System.out.println("liczbaKoncowa = " + liczbaKoncowa);
    }
}
    /*
    rozbic na jednosci, dziesiatki, setki, tysiace
    12345 % 10 = 5     ==>  5
      12345/5 = 1234
      1234 % 10 = 4     ==>  5*10 + 4 = 54
      do untill 12345 --> 0
     */
