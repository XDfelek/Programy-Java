package counter;

public class CounterPrimitiveMain {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("counter = " + counter);
        add(counter);
        System.out.println("counter = " + counter);
    }

    private static void add(int value){
        ++value;
    }
}
