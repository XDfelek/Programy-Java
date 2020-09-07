import java.util.Arrays;

public class takisobie {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        String nowy = "palindroma";
//        String nowy2 = "Ala";
//        char znak = 'b';
//        String nowy3 = sb.append(nowy).append(nowy2).toString();
//        String nowy4 = sb.append(nowy3).append(nowy).toString();
//        System.out.println(nowy4);
//        System.out.println((int)znak);
        String liczba1="5";
        String liczba2 = "6";
        String liczba3 = sb.append(liczba1).append(liczba2).toString();
        System.out.println(liczba3);
        liczba3="5";
        System.out.println(liczba3);
String text = "ala ma kota";
        System.out.println(text.charAt(1));
char a = '9';
        System.out.println((int)a);
        int c = 49;
        char d = Character.forDigit(49,10);
        System.out.println("character for digit = " + d);
char []e = Character.toChars(80);
char[]napis = {'a','b'};
        System.out.println((int)napis[0]);
char[]f = Character.toChars((int)napis[0]-32);
        System.out.println(f[0]);
        char[]wyraz = text.toCharArray();
        for (int i=0; i<wyraz.length;i++){

        }
    }
}
