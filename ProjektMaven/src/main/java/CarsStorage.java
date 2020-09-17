import java.math.BigDecimal;

public class  CarsStorage {
    public static Car[] carsStorage = new Car[100];
    public static Car[] carsStorageRented = new Car[100];
    public static int carsStorageNumber = 0;
    public static int carsStorageRentedNumber = 0;



    public void getCarsStorageString(){
      for (int i = 0; i<carsStorage.length; i++){
          System.out.println(this.carsStorage[i].getCarDataToString());
      }
    }
}
