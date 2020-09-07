import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lookForNawiasy = scanner.nextLine();
        int iloscWystapienWypuklychWLewo = 0;
        int iloscWystapienWypuklychWPrawo = 0;
        char[] nawiasyTable = lookForNawiasy.toCharArray();
        for (int i = 0; i < nawiasyTable.length; i++) {
            if (nawiasyTable[i] == '('){
                iloscWystapienWypuklychWLewo++;
            }
            if (nawiasyTable[i]==')'){
                if (iloscWystapienWypuklychWLewo>0) {
                    iloscWystapienWypuklychWPrawo++;
                }else{
                    iloscWystapienWypuklychWPrawo--;
                    break;
                }
            }
        }
        if (iloscWystapienWypuklychWLewo==iloscWystapienWypuklychWPrawo){
            System.out.println("OK");
        }else{
            System.out.println("Błędne sparowanie nawiasów");
        }
    }
}