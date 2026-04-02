package week1.Assignment.lab3.p3.composite;


public class Cylinder {
    private double height;
    private Circle cl; // composition

    public Cylinder(double height, double radius) {
        this.height = height;
        cl = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return cl.getRadius();
    }

    public double computeVolume() {
        return cl.computeArea() * height;
    }
}

