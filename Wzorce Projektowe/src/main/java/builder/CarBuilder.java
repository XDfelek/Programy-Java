package builder;

import java.time.LocalDate;
import java.util.List;

public interface CarBuilder {
    Car build();

    CarBuilder setName(String name);
    CarBuilder setBrand(String brand);
    CarBuilder setProductionDate(LocalDate productionDate);
    CarBuilder setEngine(double engine);
    CarBuilder setEquipment(List<String> equipment);
    CarBuilder setHistory(Car.History history);
}
