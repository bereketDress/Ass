package week1.Assignment.lab3.p2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
    private List<Building> coll;

    public LandLord() {
        this.coll = new ArrayList<>();
    }

    public void addBuilding(Building b) {
        coll.add(b);
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building b : coll) {
            totalProfit += b.calculateProfit();
        }
        return totalProfit;
    }
}
