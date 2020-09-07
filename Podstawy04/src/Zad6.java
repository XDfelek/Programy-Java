public class Zad6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100000; i++){
            if (i%3==0 && i%5==0 && i%7==0){
                System.out.println("i = " + i + "     i jest podzielne przez 3, 5 i 7");
            }
        }
    }
}
