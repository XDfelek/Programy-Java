import java.util.Scanner;

public class PasswordGuesserTestDebuggera {
    public static void main(String[] args) {
        String expectedPassword = "Secret";
        Scanner sc = new Scanner(System.in);
        boolean passwordGuessed = false;
        for (int i = 0; i < 3; i++) {

            System.out.print("Podaj hasło: ");
            String password = sc.nextLine();
            if (expectedPassword == password) {
                passwordGuessed = true;
                break;
            } else if (i == 2) {
                break;
            } else {
                System.out.println("Hasło niepoprawne. Spróbuj jeszcze raz");
            }
        }
        if (passwordGuessed) {
            System.out.println("Hasło poprawne");
        } else {
            System.out.println("Hasło niepoprawne, wykorzystałeś wszystkie próby");
        }
    }
}
