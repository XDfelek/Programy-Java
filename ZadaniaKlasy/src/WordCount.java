import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Tekst");
        String text = scanner.nextLine();

        String lowerCaseText = text.toLowerCase();
        String[] words = lowerCaseText.split(" ");
        Arrays.sort (words);
        System.out.println("words= " + Arrays.toString(words));
        for (int i = 0; i< words.length;){
            String currentWord = words[i];
            int currentWordCount = 1;
            int j=i+1;
            for(; j<words.length; j++){
                String wordAhead = words[j];
                if (currentWord.equals(wordAhead)){
                    ++currentWordCount;
                }else{
                    break;
                }
            }
            i=j;
            System.out.printf("%s - %d\n", currentWord, currentWordCount);
        }

    }
}
