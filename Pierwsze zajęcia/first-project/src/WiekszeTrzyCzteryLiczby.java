public class WiekszeTrzyCzteryLiczby {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int d = 4;
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > c && b > d) {
            System.out.println(b);
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
