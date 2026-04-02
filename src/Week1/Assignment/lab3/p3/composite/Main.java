package week1.Assignment.lab3.p3.composite;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.computeArea());

        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("Cylinder Volume: " + cylinder.computeVolume());
    }
}

