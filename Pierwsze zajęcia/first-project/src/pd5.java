public class pd5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i);
            if (i%2==0){
                System.out.print(", podzielne przez 2");
            }
            if (i%3==0){
                System.out.print(", podzielne przez 3");
            }
            if (i%5==0){
                System.out.print(", podzielne przez 5");
            }
            System.out.println();
        }
    }
}
