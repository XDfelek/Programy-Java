import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A");
        int a = scanner.nextInt();

      
        System.out.println("Podaj B");
        int b = scanner.nextInt();


       while (a<b){
           a=a+2*a;
       }


        System.out.println(a);
        System.out.println(b);
    }
}
