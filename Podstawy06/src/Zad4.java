import java.util.Arrays;


// Napisz program, który wypisze tabliczkę mnożenia na konsolę (skorzytaj z tablicy dwuwymiarowej).

public class Zad4 {
    public static void main(String[] args) {
        int[][] tabliczkaMnozenia = new int[10][10];
        for (int i = 0; i< tabliczkaMnozenia.length; i++){
            for (int j = 0; j< tabliczkaMnozenia[i].length; j++){
                tabliczkaMnozenia[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i< tabliczkaMnozenia.length; i++){
            for (int j = 0; j< tabliczkaMnozenia[i].length; j++){
                System.out.println((i+1) + " x " + (j+1) + " = " + tabliczkaMnozenia[i][j] );
            }
        }


        /*  int x = 1;
        int y = 1;
        for (int[] wysokosc : tabliczkaMnozenia) {

            for (int dlugosc : wysokosc) {
                wysokosc[dlugosc] = x * y;
                //System.out.print(x * y + "\t");
                x++;
            }

          //  System.out.println();
            x = 1;
            y++;

        }

        for (int[] insideTable : tabliczkaMnozenia){
            for (int insideValue : insideTable){
                System.out.println(insideValue);
            }
            System.out.println(Arrays.toString(insideTable));
        }

       */

    }
}
