package week1.Assignment.lab3.p4;

public abstract class Property {
    protected Address address;

    public Property(Address address) {
        this.address = address;// not use new: property is abstract class & has no specific property type
    }

    public Address getAddress() {
        return address;
    }

    public abstract double computeRent();
}
