public class Zad8 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = -10; i <= 100; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                suma += i;
            }

        }
        System.out.println(suma);
    }
}
