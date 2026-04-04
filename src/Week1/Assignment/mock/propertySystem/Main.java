package week1.Assignment.mock.propertySystem;
import java.util.*;

// Test Class (Main)
public class Main {
    public static void main(String[] args) {
        // Create apartments
        Apartments a1 = new Apartments(800);
        Apartments a2 = new Apartments(950);
        Apartments a3 = new Apartments(1000);

        // Create buildings
        Building b1 = new Building(101);
        b1.addApartment(a1);
        b1.addApartment(a2);

        Building b2 = new Building(102);
        b2.addApartment(a3);

        // Create owner and assign buildings
        Owner owner = new Owner("John Doe", "555-1234");
        owner.addBuilding(b1);
        owner.addBuilding(b2);

        // Calculate total rent
        System.out.println("Total Rent for Owner: $" + owner.getRent());
    }
}

