package week1.Assignment.mock.channelService;

import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Service> services;

    public Customer(String name) {
        this.name = name;
        services = new Vector<>();
    }

    public void subscribe(Service serve) {
        services.add(serve);
    }

    public void unsubscribe(Service serve) {
        services.remove(serve);
    }

    public double totalFee() {
        double total = 0;
        for (Service service : services) {
            total += service.calcFee();
        }
        return total;
    }
}