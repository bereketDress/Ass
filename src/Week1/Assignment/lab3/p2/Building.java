package week1.Assignment.lab3.p2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments = new ArrayList<>();
    private double maintenanceCost;

    public Building(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment a) {
        apartments.add(a);
    }

    public double calculateProfit() {
        double totalRent = 0;
        for (Apartment a : apartments) {
            totalRent += a.getRent();
        }
        return totalRent - maintenanceCost;
    }
}
