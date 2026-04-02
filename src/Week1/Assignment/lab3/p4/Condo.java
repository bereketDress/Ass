package week1.Assignment.lab3.p4;

public class Condo extends Property {
    private int numFloors;

    public Condo(int numFloors) {
        super(new Address("", "", "", ""));
        this.numFloors = numFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numFloors;
    }
}