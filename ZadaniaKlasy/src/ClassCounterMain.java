public class ClassCounterMain {
    public static void main(String[] args) {

        int initialNumberOfObjects = ClassCounter.getNumberOfObjects();
        System.out.println("initialNumberOfObjects = " + initialNumberOfObjects);

        ClassCounter p1 = new ClassCounter("Name1");
        ClassCounter p2 = new ClassCounter("Name2");
        ClassCounter p3 = new ClassCounter("Name3");

        initialNumberOfObjects = ClassCounter.getNumberOfObjects();
        System.out.println("initialNumberOfObjects = " + initialNumberOfObjects);


    }
}
