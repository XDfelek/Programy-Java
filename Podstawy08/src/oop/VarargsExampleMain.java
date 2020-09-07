package oop;

public class VarargsExampleMain {
    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();
        int suma = example.sum(1,2,3,4,5,6,7,8);
        int min = example.min(1,2,3,4,5,6,7,8);
        int max = example.max(1,2,3,4,5,6,7,8);
        System.out.println("suma = " + suma);
        System.out.println("min osobny = " + min);
        System.out.println("max osobny = " + max);
        System.out.println(example.minMax(1,2,3,4,5,6,7,8));
    }
}
