public class pd9b {
    public static void main(String[] args) {
        for (int y = 1; y <= 10; y++) {
            for (int z = 1; z <= y; z++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (10-y); z++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
