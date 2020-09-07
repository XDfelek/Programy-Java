public class ArrayIntroduction {
    public static void main(String[] args) {

        //[]
        //typ[] nazwa = new typ [rozmiar];

        int[] tablica1 = new int[10];
        boolean[] tablica2 = new boolean[10];
        double[] tablica3 = new double[10];

        //typ[] nazwa = {1, 2, 3, 4};
        char[] tablica4 = {'a', 'b', 'c'};

        //rzadko spotykany
        int tablicaSpecjalna[] = new int[10];

        int[] tablica6;
        //tablica6 == null
        //tablica6 ----------(RAM)--------> NULL

        //tablica7 = [X,X,X]
        int[] tablica7 = new int[3]; // [0,0,0]
        boolean[] tablica8 = new boolean[6]; //[false x6]

        //rozmiar tablicy
        int[] tablica9 = new int[100];
        int tablica9Lenght = tablica9.length;
        System.out.println("tablica9Lenght = " + tablica9Lenght);

        //wpisywanie
        int zTablicy = tablica9[5];
        System.out.println("zTablicy = " + zTablicy);

        int doWpisania = 17;
        int indexDoWpisania = 1;
        tablica9[indexDoWpisania] = doWpisania;
        int zTablicyIndex1 = tablica9[indexDoWpisania];
        System.out.println("zTablicyIndex1 = " + zTablicyIndex1);

        String[] tablicaStringow = new String[10];
                                                       // tablicaStringow[10] = "";     --->     niepoprawne bo liczy od 0 do 9
                                                       // tablicaStringow[-1] = "";     --->     niepoprawne

    }
}
