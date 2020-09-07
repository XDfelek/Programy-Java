package oop;

public class ExForMethods {

    public int sum(int number1, int number2){
        int tempSum = number1 + number2;
        return tempSum;
    }

    public int substract(int number1, int number2){
        int tempSub = number1 - number2;
        return tempSub;
    }
    public int multiply(int number1, int number2){
        int tempMul = number1 * number2;
        return tempMul;
    }
    public double divide(int number1, int number2){
        if (number2 == 0){
            System.out.println("pamiętaj cholero nie dziel przez zero");
            return -1;
        }
        double tempDiv = (double)number1 / (double)number2;
        return tempDiv;
    }

}
