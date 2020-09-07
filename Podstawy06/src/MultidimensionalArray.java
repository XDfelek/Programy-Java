import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // typ[] nazwa = ...
        // tym -> typ[]
        int[][] tablicaWielowymiarowa = new int[4][5];
        int[] tabPodIdxZero = tablicaWielowymiarowa[0];
        int tabPodIdxZeroZero = tabPodIdxZero[0];

        int tabPodIdxJedenJeden = tablicaWielowymiarowa[1][1];
        int[] tablica1 = new int [3];
        System.out.println("tablica1 = " + tablica1);
        System.out.println("tablica1 = " + Arrays.toString(tablica1));
        System.out.println("tablicaWielowymiarowa = " + Arrays.toString(tablicaWielowymiarowa));

        tablicaWielowymiarowa[2][3] = 7;            //2,3 to 3 i 4 miejsce w tabeli

        for (int i = 0; i< tablicaWielowymiarowa.length; i++){
            int[] tabValue = tablicaWielowymiarowa[i];
            System.out.println("tabValue = " + Arrays.toString(tabValue));
        }

        System.out.println("tablica wielowymiarowa = " + Arrays.deepToString(tablicaWielowymiarowa));



    }
}
