public class Zad1 {
    public static void main(String[] args) {
        
        int[] tab = {1, 2, 3, 4, 5, 7, 7};
        for (int i = 0; i < tab.length; i++){
            int value = tab[i];
            if (value == 7)
                System.out.println("w tablicy jest " + value);
        }
        
        
    }
}
/*
1. Napisz program, który sprawdza czy dana liczba jest obecna w tablicy (liczby można podać z góry - nie trzeba czytać z konsoli).
 */