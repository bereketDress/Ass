package week1.Assignment.mock.channelService;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer coll = new Customer("Bereket");

        Service s1 = new Monthly(2, LocalDate.of(2025, 9, 1));
        System.out.println(s1.calcFee());
        Service s2 = new Daily(1, LocalDate.of(2025, 10, 1));
        System.out.println(s2.calcFee());

        coll.subscribe(s1);
        coll.subscribe(s2);

        System.out.println("Total Fee: $" + coll.totalFee());
    }
}