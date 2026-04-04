package week1.Assignment.mock.propertySystem;

import java.util.ArrayList;
import java.util.List;

class Owner {
    private String name;
    private String phone;
    private List<Building> buildings;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building bu) {
        buildings.add(bu);
    }

    public double getRent() {
        double total = 0;
        for (Building b : buildings) {
            total += b.getRent();
        }
        return total;
    }
}