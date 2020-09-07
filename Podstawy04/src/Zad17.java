public class Zad17 {
    public static void main(String[] args) {
        int wielkoscTrojkata = 19;
        int temp2 = (wielkoscTrojkata + 1) / 2;
        for (int y = 0; y < temp2; y++) {
            for (int x = 0; x < wielkoscTrojkata; x++) {
                if (x >= y) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            wielkoscTrojkata--;
        }
    }
}
