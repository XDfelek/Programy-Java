import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        boolean empty = "".isEmpty();
        boolean empty2 = "         ".isEmpty();
        System.out.println("\"        \".isBlank = " + "         ".isBlank());

        //Lenght
        System.out.println("\"\".length = " + "".length());
        System.out.println("\"SDA\".length = " + "SDA".length());
        System.out.println("\"        \".length = " + "        ".length());

        //toLowerCase
        System.out.println("\"To Jest Moj Text\".toLowerCase() = " + "To Jest Moj Text".toLowerCase());
        //toUpperCase
        System.out.println("\"To Jest Moj Text\".toUpperCase() = " + "To Jest Moj Text".toUpperCase());

        //equals
        System.out.println("\"sda\".equals(\"sda\") = " + "sda".equals("sda"));
        System.out.println("\"sda\".equals(\"SDA\") = " + "sda".equals("SDA"));
        System.out.println("\"sda\".equalsIgnoresCase(\"SDA\")" + "sda".equalsIgnoreCase("SDA"));

        //toCharArray
        char[] helloWorldChars = "Hello world".toCharArray();
        System.out.println("tablica char = " + Arrays.toString(helloWorldChars));

        //charAt
        System.out.println("\"SDA\".charAt(0) = " + "SDA".charAt(0));
        System.out.println("\"SDA\".charAt(1) = " + "SDA".charAt(1));
        System.out.println("\"SDA\".charAt(2) = " + "SDA".charAt(2));

        //substring
        System.out.println("\"To jest mój string\".substring(3) = " + "To jest mój string".substring(3));
        System.out.println("\"To jest mój string\".substring(3,8) = " + "To jest mój string".substring(3, 8));

        //replace
        System.out.println("\"Hello, world\".replace(\"Hello\",\"HELLO\") = " + "Hello, world".replace("Hello", "HELLO"));

        //split
        String[] split = "Hello world in sda".split(" ");
        System.out.println("split = " + Arrays.toString(split));

        //String -> int/double conversion
        int parsedInt = Integer.parseInt("123");
        System.out.println("parsedInt = " + parsedInt);

        double parsedDouble = Double.parseDouble("123.45");
        System.out.println("parsedDouble = " + parsedDouble);

        //indexOf
        System.out.println("\"abba\".indexOf(\"a\") = " + "abba".indexOf("a"));
        System.out.println("\"abba\".indexOf(\"y\") = " + "abba".indexOf("y"));  //jak czegos nie ma to wyjdzie -1

        //lastIndexOf
        System.out.println("\"abba\".lastIndexOf(\"a\") = " + "abba".lastIndexOf("a"));

        //contains
        System.out.println("\"ala ma kota\".contains(\"ma\") = " + "ala ma kota".contains("ma"));

        //intern
        // tworzy kopie (o ile nie istnieje) tekstu w string pool
        // a nastepnie go zwraca
        String sdaIntern = "SDA".intern();
        System.out.println("sdaIntern = " + sdaIntern);

        //format (+System.out)
        int wiek = 27;
        String name = "Kamil";
        String zawod = "trener";
        String text = "Person: " + name + ", wiek: " + wiek + ", zawód: " + zawod;
        System.out.println(text);

        double pensja = 10.0;
        String format = "Person: %s, wiek: %d, zawód: %s, pensja: %.2f";
        String wypelniony = String.format(format, name, wiek, zawod, pensja);
        System.out.println("wypelniony = " + wypelniony);
        System.out.printf(format, name, wiek, zawod, pensja);
        Locale.setDefault(Locale.ENGLISH);
        System.out.printf(format, name, wiek, zawod, pensja);

    }
}
