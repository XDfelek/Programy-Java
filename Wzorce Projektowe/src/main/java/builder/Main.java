package builder;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl()
                .setName("Focus")
                .setBrand("Ford")
                .setEngine(1.6)
                .setHistory(Car.History.BEZWYPADKOWY)
                .setProductionDate(LocalDate.of(2008,12,12))
                .setEquipment(List.of("ABS","Klima","grzane d", "alu"))
                .build();



        System.out.println(car);
    }
}
