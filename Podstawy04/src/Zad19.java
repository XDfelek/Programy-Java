public class Zad19 {

    public static void main(String[] args) {

        int licznik = 1;
        int linijki = 10;
        for (int i = 1; i <= linijki; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(licznik + "\t");
                licznik++;
            }
            System.out.println();
        }
    }
}
