import java.util.Arrays;

public class PersonMain {
    //1. Stwórz klasę Person, która będzie przechowywała imię, nazwisko oraz wiek osoby.
    //2. Dodaj konstruktor, który inicjalizuje klasę z imieniem i nazwiskiem.
    //3. Do instniejącej klasy dodaj konstruktor, pozwalający zainicjalizować obiekt z imieniem, nazwiskiem oraz wiekiem.
    //4. Dodaj gettery, settery oraz bezargumentowy konstruktor.
    //5. Dodaj metodę, która sprawdza czy osoba jest pełnoletnia.
    //6. Metoda toString powinna zwarać informacje o ososbie w formacie: "(imie, nazwisko) -> wiek"
    public static void main(String[] args) {
        Person person = new Person();
        person.set("Andrzej","Walencik",17);
        person.setName("Tomasz");
        person.print();
        System.out.println("person.isOfAge() = " + person.isOfAge());
    }
}