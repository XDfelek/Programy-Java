import java.util.Scanner;

public class Zad02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz do stringa:");
        String text = scanner.nextLine();
        System.out.println("stringScanned = " + text);
        System.out.println("ktore miejsce usunac?");
        int liczbaIndexDoWyciecia = scanner.nextInt();
        liczbaIndexDoWyciecia -= 1;
        if (liczbaIndexDoWyciecia > text.length()) {
            System.out.println("Index " + liczbaIndexDoWyciecia + " nie istnieje");
        } else {

            char[] textChar = text.toCharArray();

            for (int i = 0; i < textChar.length; i++) {
                if (i < liczbaIndexDoWyciecia) {
                    continue;
                } else if (i < textChar.length - 1) {
                    textChar[i] = textChar[i + 1];
                } else {
                    textChar[i] = ' ';
                }
            }
            text = String.copyValueOf(textChar);
            text = text.substring(0,(textChar.length-1));
            System.out.println(text);

        }
    }
}
