import java.math.BigDecimal;
import java.time.LocalDate;

public class Report {
    private User user;
    private Car car;
    private BigDecimal price;
    private LocalDate transakcionDate;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getTransakcionDate() {
        return transakcionDate;
    }

    public void setTransakcionDate(LocalDate transakcionDate) {
        this.transakcionDate = transakcionDate;
    }

    public Report(User user, Car car, BigDecimal price, LocalDate dateOfTransaction) {
        this.user = user;
        this.car = car;
        this.price = price;
        transakcionDate = dateOfTransaction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
