package oop;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Kamil", 1001L);
        s.setName("Kamil");
        s.setId(2000L);

        System.out.println("s.getId() = " + s.getId());

        String StudentAsString = s.toString();
        System.out.println("StudentAsString = " + StudentAsString);

        //toString 1
        System.out.println("s = " + s);
        System.out.println(s);
    }
}
