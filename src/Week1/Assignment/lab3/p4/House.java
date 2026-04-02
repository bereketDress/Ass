package week1.Assignment.lab3.p4;
public class House extends Property {
    private double lotSize;

    public House(double lotSize) {
        super(new Address("", "", "", ""));
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
