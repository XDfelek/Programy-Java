package counter;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("counter.getValue() = " + counter.getValue());
        increment(counter);
        System.out.println("counter.getValue() = " + counter.getValue());
    }
    private static void increment(Counter counter){
        counter.increment();
    }
}
