public class ClassCounter {
    // One per ALL objects
    private static int numberOfObjects = 0;
    // One per object
    private String name;

    public ClassCounter(String name){
        this.name = name;
        ++numberOfObjects;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

}
