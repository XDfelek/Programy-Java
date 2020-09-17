import java.time.LocalDate;

public class User {
    private String name;
    private String surname;
    private String pesel;
    private LocalDate birthDate;
    private int carsRentedByUser = 0;
    private int userNumber = UserStorage.numberOfUsers;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPesel(){
        return this.pesel;
    }
    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public LocalDate getBirthDate (){
        return this.birthDate;
    }
    public void setBirthDate(ScanDate scanBirthDate){
        LocalDate birthDate = scanBirthDate.getDate();
        this.birthDate = birthDate;
    }

    public int getCarsRentedByUser(){
        return carsRentedByUser;
    }

    public User (String name, String surname, String pesel){
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        UserStorage.numberOfUsers = userNumber + 1;
        birthDate = UserStorage.
    }





}
