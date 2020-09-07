import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        double podatek;
        if (income<=85528.00 && income >556.0){
            podatek = 0.18*income - 556.02;
        }else if (income>85528.00){
            podatek = 14839.02+0.32*(income-85528);
        }else{
            podatek = 0;
        }
        System.out.println(podatek);
    }
}