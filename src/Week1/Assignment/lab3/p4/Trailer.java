
package week1.Assignment.lab3.p4;

public class Trailer extends Property {
    public Trailer() {
        super(new Address("", "", "", ""));
    }

    @Override
    public double computeRent() {
        return 500;
    }
}
