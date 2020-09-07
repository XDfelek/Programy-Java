package oop;

public class Person {

    public String name;
    public String lastName;
    public int age;

    // public int... <- zwracamy liczbe
    // public String... <- zwracamy stringa
    // public double[]... <- zwracamy tablice
    // public void... <- zwracamy nic
    public boolean isOfAge(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public void foo(int value) {
        if (value % 2 == 0){
            System.out.println("parzystych nie obsluguje");
            return;
        }
        System.out.println("Hello");
        System.out.println("World");
    }


}
