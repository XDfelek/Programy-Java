import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();
        if (amount<100 || amount > 10000){
            amount = 5000;
        }
        if(numberOfInstallments<6 || numberOfInstallments>48){
            numberOfInstallments = 36;
        }
        double oprocentowanie;
        if (numberOfInstallments<=12){
            oprocentowanie = 0.025;
        }else if (numberOfInstallments >12 && numberOfInstallments<=24){
            oprocentowanie = 0.05;
        }else{
            oprocentowanie = 0.1;
        }
        double kwotaRaty = (amount*(1+oprocentowanie))/(double)numberOfInstallments;
        System.out.println(kwotaRaty);

    }
}