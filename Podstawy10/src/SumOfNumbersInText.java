import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInText {

    //wyciag sume wszystkich liczb (cyfry pomijamy) z tekstu
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d{2,})");
        //sum = 121
        Matcher matcher = pattern.matcher("ab1cd55efgbsag66");

        int sum = 0;
        while (matcher.find()){
            matcher.group(1);
            String group1 = matcher.group(1);
            sum += Integer.parseInt(group1);
        }
        System.out.println("sum = " + sum);
    }
}
