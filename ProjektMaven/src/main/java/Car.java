import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Car {
    static public int iloscSamochodow = 0;

    public String carBrand;
    public String carModel;
    public long carMilage;
    public LocalDate carYearOfProduction;
    BigDecimal carPricePerDay;

    public String carDataToString (){
        String carData =iloscSamochodow + ": " + carBrand + " - " + carModel + ". Mileage: " + carMilage + ", year of production: " + carYearOfProduction + ", price per day: " + carPricePerDay + "\n";
        return carData;
    }
    //public String[] carData;
/*

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
*/




    public String getCarModel(){
        return carModel;
    }
    public void setCarModel(String carModel){
        iloscSamochodow++;
        this.carModel = carModel;
    }

    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }

    public long getCarMilage(){
        return carMilage;
    }
    public void setCarMilage(int carMilage){
        this.carMilage = carMilage;
    }

    public LocalDate getCarYearOfProduction(){
        return carYearOfProduction;
    }
    public void setCarYearOfProduction(ScanDate scanCarYearOfProduction){
        LocalDate carYearOfProduction = scanCarYearOfProduction.getDate();
        this.carYearOfProduction = carYearOfProduction;
    }

    public BigDecimal getCarPricePerDay(){
        return carPricePerDay;
    }
    public void setCarPricePerDay(BigDecimal carPricePerDay){
        this.carPricePerDay = carPricePerDay;
    }

}
