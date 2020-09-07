public class Person {
    public String name = "no data";
    public String surname = "no data";
    public int age = 0;

    public void set (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void print(){
        System.out.println("imie = " + this.name);
        System.out.println("nazwisko = " + this.surname);
        System.out.println("wiek = " + this.age);
    }
    public boolean isOfAge(){
        if (this.age>=18){
            return true;
        }else {
            return false;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
}
