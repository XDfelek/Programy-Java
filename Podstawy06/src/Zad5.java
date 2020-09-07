
// Napisz program, który zamienia elementy w tablicy. Z tablicy: [1, 2, 3, 4]
// powinna powstać tablica [4, 3, 2, 1]. Ma to być ta sama tablica


public class Zad5 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < tab.length/2; i++){
            int tempLenght = tab.length - (i+1);
            int temp = tab[i];
            tab[i] = tab[tempLenght];
            tab[tempLenght] = temp;
        }
        for (int wyswietl : tab){
            System.out.print(wyswietl + "\t");
        }
    }
}
