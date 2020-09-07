public class PreAndPostIncrementation {
    public static void main(String[] args) {
        int zmienna = 5;
        zmienna += 1;
        //zmienna++

        int wartosc = zmienna++;
        System.out.println("wartosc = " + wartosc);
        System.out.println("zmienna = " + zmienna);
    }
}
