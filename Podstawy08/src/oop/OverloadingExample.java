package oop;

public class OverloadingExample {

    public int sum(int number1, int number2){
        int tempSum = number1 + number2;
        return tempSum;
    }

    public int sum(int number1, int number2, int number3){
        int tempSum = number1 + number2 + number3;
        return tempSum;
    }

    public double sum(double number1, double number2){
        double tempSum = number1 + number2;
        return tempSum;
    }

}
