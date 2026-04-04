package week1.Assignment.mock.channelService;

import java.time.LocalDate;

public class Monthly extends Service {


    public Monthly(int dailyPrice, LocalDate subDate) {
        super(dailyPrice, subDate);
    }

    @Override
    public double calcFee() {
        int totalDays = dateDifference();

        // Calculate complete months
        int completeMonths = totalDays / 30;

        // Calculate remaining days
        int remainingDays = totalDays % 30;

        // Charge for complete months + remaining days
        return (completeMonths * 30 * getDailyPrice()) + (remainingDays * getDailyPrice());
    }

}
