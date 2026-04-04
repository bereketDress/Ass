package week1.Assignment.mock.propertySystem;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int buildingNumber;
    private List<Apartments> apartments;

    public Building(int buildingNumber) {
        this.buildingNumber = buildingNumber;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartments apartment) {
        apartments.add(apartment); // Fixed reference
    }

    public double getRent() {
        double total = 0;
        for (Apartments a : apartments) {
            total += a.getRent();
        }
        return total;
    }
}
