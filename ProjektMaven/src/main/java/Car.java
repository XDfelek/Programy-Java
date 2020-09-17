import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Car {


    public String carBrand;
    public String carModel;
    public long carMilage;
    public LocalDate carYearOfProduction;
    BigDecimal carPricePerDay;
    public boolean isRented = false;

    public String getCarDataToString() {
        String carData = carBrand + " - " + carModel + ". Mileage: " + carMilage + ", year of production: " + carYearOfProduction + ", price per day: " + carPricePerDay + "\n";
        return carData;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        // iloscSamochodow++;
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public long getCarMilage() {
        return carMilage;
    }

    public void setCarMilage(int carMilage) {
        this.carMilage = carMilage;
    }

    public LocalDate getCarYearOfProduction() {
        return carYearOfProduction;
    }

    public void setCarYearOfProduction(ScanDate scanCarYearOfProduction) {
        LocalDate carYearOfProduction = scanCarYearOfProduction.getDate();
        this.carYearOfProduction = carYearOfProduction;
    }

    public BigDecimal getCarPricePerDay() {
        return carPricePerDay;
    }

    public void setCarPricePerDay(BigDecimal carPricePerDay) {
        this.carPricePerDay = carPricePerDay;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public Car(String carBrand, String carModel, int carMilage, ScanDate scanCarYearOfProduction, BigDecimal carPricePerDay) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carMilage = carMilage;
        LocalDate carYearOfProduction = scanCarYearOfProduction.getDate();
        this.carYearOfProduction = carYearOfProduction;
        this.carPricePerDay = carPricePerDay;
        CarsStorage.carsStorageNumber++;

    }

}
