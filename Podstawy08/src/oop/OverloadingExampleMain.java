package oop;

public class OverloadingExampleMain {
    public static void main(String[] args) {

        OverloadingExample example = new OverloadingExample();
        int sumaIntow = example.sum(1,2);
        double sumaDoubli = example.sum(1.0,2.0);
        int suma3Intow = example.sum(1,2,3);
    }
}
