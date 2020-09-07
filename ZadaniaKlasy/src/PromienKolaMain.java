public class PromienKolaMain {
    //2.
    //1. Stwórz klasę Koło, która przechowuje promień koła.
    //2. Dodaj konstruktor, który pozwala zainicjalizować koło z już ustawionym promieniem.
    //3. Dodaj metody, które obliczają pole oraz obwód koła.
    //4. Dodaj metodę "doubleSize", która zwraca nowe koło, o promieniu dwukrotnie większym.
    public static void main(String[] args) {
        PromienKola kolo = new PromienKola();
        kolo.setPromien(10);
        System.out.println("kolo.getPromien() = " + kolo.getPromien());
        System.out.println("kolo.getObwod() = " + kolo.getObwod());
        System.out.println("kolo.getPole() = " + kolo.getPole());
        kolo.doubleSize();
        System.out.println("kolo.getPromien() po doublesize = " + kolo.getPromien());
        System.out.println("kolo.getObwod() po doublesize = " + kolo.getObwod());
        System.out.println("kolo.getPole() po doublesize = " + kolo.getPole());
    }
}
