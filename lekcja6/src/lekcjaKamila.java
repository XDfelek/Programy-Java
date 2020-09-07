import java.util.Arrays;
import java.util.Locale;

public class lekcjaKamila {
    public static void main(String[] args) {
        //         Escapowanie stringow
        System.out.println("to jest cudzysłów: \"");
        //isEmpty
        boolean empty = "".isEmpty();
        System.out.println("empty = " + empty);
        boolean empty2 = "      ".isEmpty();
        System.out.println("empty2 = " + empty2);
        System.out.println("\"     \".isBlank() = " + "     ".isBlank());
        // length
        System.out.println("\"\".length() = " + "".length());
        System.out.println("\"SDA\".length() = " + "SDA".length());
        System.out.println("\"   \".length() = " + "   ".length());
        // toLowerCase
        System.out.println("\"To Jest Moj Text\".toLowerCase() = " + "To Jest Moj Text".toLowerCase());
        // toUpperCase
        System.out.println("\"To Jest Moj Text\".toUpperCase() = " + "To Jest Moj Text".toUpperCase());
        // equals
        System.out.println("\"sda\".equals(\"sda\") = " + "sda".equals("sda"));
        System.out.println("\"sda\".equals(\"SDA\") = " + "sda".equals("SDA"));
        System.out.println("\"sda\".equalsIgnoreCase(\"SDA\") = " + "sda".equalsIgnoreCase("SDA"));
        // toCharArray
        char[] helloWorldChars = "Hello world".toCharArray();
        System.out.println("helloWorldChars = " + Arrays.toString(helloWorldChars));
        // charAt
        System.out.println("\"SDA\".charAt(0) = " + "SDA".charAt(0));
        System.out.println("\"SDA\".charAt(1) = " + "SDA".charAt(1));
        System.out.println("\"SDA\".charAt(2) = " + "SDA".charAt(2));
        // substring
        System.out.println("\"To jest mój string\".substring(3) = " + "To jest mój string".substring(3));
        System.out.println("\"To jest mój string\".substring(3, 7) = " + "To jest mój string".substring(3, 7));
        // replace
        System.out.println("\"Hello World\".replace(\"Hello\", \"HELLO\") = " + "Hello World".replace("Hello", "HELLO"));
        // split
        String[] split = "Hello world in sda".split(" ");
        System.out.println("split = " + Arrays.toString(split));
        // string -> int/double conversion
        int parsedInt = Integer.parseInt("123");
        System.out.println("parsedInt = " + parsedInt);
        double parsedDouble = Double.parseDouble("567.8");
        System.out.println("parsedDouble = " + parsedDouble);
        // indexOf
        System.out.println("\"abba\".indexOf(\"a\") = " + "abba".indexOf("a"));
        System.out.println("\"abba\".indexOf(\"y\") = " + "abba".indexOf("y"));
        // lastIndexOf
        System.out.println("\"abba\".lastIndexOf(\"a\") = " + "abba".lastIndexOf("a"));
        // contains
        boolean alaHasCat = "ala ma kota".contains("ma");
        System.out.println("alaHasCat = " + alaHasCat);
        // intern
        // Tworzy kopie (o ile nie istnieje) tekstu w string pool
        // a następnie go zwraca
        String sdaIntern = "SDA".intern();
        System.out.println("sdaIntern = " + sdaIntern);
        // format (+System.out)
        int wiek = 27;
        String name = "Kamil";
        String zawod = "Trener";
        double pensja = 10.0;
        String text = "Person: " + name + ", wiek: " + wiek + ", zawód: " + zawod
                + ", pensja: " + pensja;
        System.out.println(text);
        String format = "Person: %s, wiek: %d, zawód: %s, pensja: %.4f";
        String wypelniony = String.format(format, name, wiek, zawod, pensja);
        System.out.println(wypelniony);
        System.out.printf(Locale.ENGLISH, format, name, wiek, zawod, pensja);
    }
}
