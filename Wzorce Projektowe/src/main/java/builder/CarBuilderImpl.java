package builder;

import java.time.LocalDate;
import java.util.List;

public class CarBuilderImpl implements CarBuilder{
    private Car car;

    public CarBuilderImpl(){
        this.car = new Car();
    }

    @Override
    public Car build() {
        return car;
    }

    @Override
    public CarBuilder setName(String name) {
        car.setName(name);
        return this;
    }

    @Override
    public CarBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    @Override
    public CarBuilder setProductionDate(LocalDate productionDate) {
        car.setProductionDate(productionDate);
        return this;
    }

    @Override
    public CarBuilder setEngine(double engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setEquipment(List<String> equipment) {
        car.setEquipment(equipment);
        return this;
    }

    @Override
    public CarBuilder setHistory(Car.History history) {
        car.setHistory(history);
        return this;
    }
}
