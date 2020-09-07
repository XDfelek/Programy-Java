import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lookingForJava = scanner.nextLine();
        boolean isJava = lookingForJava.contains("Java");
        if (isJava){
            System.out.println("Znalazłem Java");
            if (lookingForJava.startsWith("Java")){
                System.out.println("Zaczyna się od Java");
            }
            if(lookingForJava.endsWith("Java")){
                System.out.println("Kończy się na Java");
            }
            if(lookingForJava.equals("Java")){
                System.out.println("Równa się Java");
            }
            System.out.println(lookingForJava.indexOf("Java"));
        }
    }
}