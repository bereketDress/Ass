package week1.Assignment.lab3.p4;

public class Address {
    private String street, city, state, zip;


    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}