public class Zad18 {

    public static void main(String[] args) {
        int liczbaPoczatkowa = 100;
        System.out.println("liczbaPoczatkowa = " + liczbaPoczatkowa);
        int iloscCyfr = 0;
        for (int i = 0; i == i; i++) {
            iloscCyfr ++;
            liczbaPoczatkowa = liczbaPoczatkowa / 10;
            if (liczbaPoczatkowa == 0) {
                break;
            }
        }
        System.out.println("iloscCyfr = " + iloscCyfr);
    }
}
