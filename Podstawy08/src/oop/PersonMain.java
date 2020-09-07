package oop;

public class PersonMain {
    public static void main(String[] args) {

        //variable -> null
        //Person variable;

        //Person object1 = new Person();

       // Person object2 = new Person();

        Person p1 = new Person();
        p1.name = "Kamil";
        p1.lastName = "Wal";
        p1.age = -1;

        Person p2 = new Person();
        p2.name = "Jan";
        p2.lastName = "Kowalski";
        p2.age = 100;

        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.lastName = " + p1.lastName);
        System.out.println("p1.age = " + p1.age);

        System.out.println("p2.name = " + p2.name);
        System.out.println("p2.lastName = " + p2.lastName);
        System.out.println("p2.age = " + p2.age);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);


    }
}
