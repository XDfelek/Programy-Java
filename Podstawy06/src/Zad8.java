// 8***. Napisz program, który wypisuje trójkąt Pascala w formacie:
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1


import java.util.Arrays;

public class Zad8 {
    public static void main(String[] args) {

        int[][] tablicaWielowymiarowa = new int[3][3];


        for (int i = 0; i < tablicaWielowymiarowa.length; i++) {
            int[] tabValue = tablicaWielowymiarowa[i];
            System.out.println("tabValue = " + Arrays.toString(tabValue));
        }
    }


}
