package week1.Assignment.mock.channelService;

import java.time.LocalDate;

public class Daily extends Service {

    public Daily(int dailyPrice, LocalDate subDate) {
        super(dailyPrice, subDate);
    }


    @Override
    public double calcFee() {
        return getDailyPrice() * dateDifference();
        }


}


