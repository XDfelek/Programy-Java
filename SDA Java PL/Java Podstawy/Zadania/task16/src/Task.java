import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
     /*   char[] textCharTable = text.toCharArray();
        for(int i = 0; i< textCharTable.length/2;i++){
            char tempChar;
            tempChar = textCharTable[i];
            textCharTable[i] = textCharTable[textCharTable.length-i-1];
            textCharTable[textCharTable.length-i-1] = tempChar;
        }
        text = Arrays.toString(textCharTable);
        */
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);

    }
}