package week1.Assignment.lab3.p4;

public class Driver {

    public static void main(String[] args) {

        Property[] pr = { new House(9000), new Condo(2), new Trailer() };
        double totalRent = Admin.computeTotalRent(pr);
        System.out.println(totalRent);
    }
}
