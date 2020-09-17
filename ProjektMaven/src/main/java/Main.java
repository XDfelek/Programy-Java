import java.math.BigDecimal;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Menu menu = new Menu();
        menu.showMainMenu();
        menu.showMenuSwitcher(menu);

        /*
        Car car01 = new Car();
        car01.setCarBrand("Honda");
        car01.setCarModel("Civic");
        car01.setCarMilage(120000);
        ScanDate sdCar01 = new ScanDate();
        sdCar01.setDate("2012-12-12");
        car01.setCarYearOfProduction(sdCar01);
        car01.setCarPricePerDay(BigDecimal.valueOf(23));
        System.out.println(car01.carDataToString());

        Car car02 = new Car();
        car02.setCarBrand("Ford");
        car02.setCarModel("Focus");
        car02.setCarMilage(120000);
        ScanDate sdCar02 = new ScanDate();
        sdCar02.setDate("2014-11-11");
        car02.setCarYearOfProduction(sdCar02);
        car02.setCarPricePerDay(BigDecimal.valueOf(30));
        System.out.println(car01.carDataToString());
        */

    }
}
