package week1.Assignment.mock.channelService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Service {
    private int dailyPrice;
    private LocalDate subDate;

    public Service(int dailyPrice, LocalDate subDate) {
        this.dailyPrice = dailyPrice;
        this.subDate = subDate;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public abstract double calcFee();

    public int dateDifference() {
       long num= ChronoUnit.DAYS.between(subDate, LocalDate.now());

        return (int)num;
    }

    @Override
    public String toString() {
        return "Service{" +
                "dailyPrice=" + dailyPrice +
                ", subDate=" + subDate +
                '}';
    }
}