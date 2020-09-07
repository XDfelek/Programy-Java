public class pd7 {
    public static void main(String[] args) {
        int ciag = 5;
        int base = 5;
        for (int i = 1; i <= 459; i++) {
            if (i == 1) {
                ciag = 5;
            } else {
                ciag = ciag + base + 2 * (i - 1);
            }
        }
        System.out.println(ciag);
    }

}
