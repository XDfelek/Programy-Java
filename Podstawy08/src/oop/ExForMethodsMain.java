package oop;

import java.util.Scanner;

public class ExForMethodsMain {
    public static void main(String[] args) {
        System.out.println("Co bys chcial zrobic?");
        System.out.println("dodać - wpisz 1");
        System.out.println("odjąć - wpisz 2");
        System.out.println("pomnożyć - wpisz 3");
        System.out.println("podzielić - wpisz 4");
        Scanner scanner = new Scanner(System.in);
        int switchValue = scanner.nextInt();
        System.out.println("podaj dwie liczby");
        System.out.print("Pierwsza: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Druga: ");
        int num2 = scanner.nextInt();
        ExForMethods calc = new ExForMethods();
        switch (switchValue){
            case 1:
                System.out.println(calc.sum(num1,num2));
                break;
            case 2:
                System.out.println(calc.substract(num1,num2));
                break;
            case 3:
                System.out.println(calc.multiply(num1,num2));
                break;
            case 4:
                System.out.println(calc.divide(num1,num2));
                break;
            default:
                System.out.println("podales zla liczbe przy wyborze");
        }
        //ExForMethods zad01 = new ExForMethods();
        //System.out.println(zad01.divide(10,2));

    }
}
