import java.math.BigDecimal;

public class Cars {
    static public int iloscWolnychSamochodow;

    public String carName;
    public int milage;
    public String yearOfProduction;
    BigDecimal pricePerDay;
    public String[] carData;


    public String[] setCarData(String carName, int milage, String yearOfProduction, BigDecimal pricePerDay) {
        this.carName = carName;
        this.milage = milage;
        this.yearOfProduction = yearOfProduction;
        this.pricePerDay = pricePerDay;
        String[] carData = {carName, "Milage: " + milage, yearOfProduction, "price per day: " + pricePerDay};
        this.carData = carData;
        return carData;
    }

    public void getCarData(){
        System.out.println(carData);
    }

}
