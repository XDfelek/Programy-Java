package builder;

import java.time.LocalDate;
import java.util.List;

public class Car {
    private String name;
    private String brand;
    private LocalDate productionDate;
    private double engine;
    private List<String> equipment;
    private History history;

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", productionDate=" + productionDate +
                ", engine=" + engine +
                ", equipment=" + equipment +
                ", history= " + history +
                '}';
    }

    public enum History {
        BEZWYPADKOWY, POWYPADKOWY
    }

}
