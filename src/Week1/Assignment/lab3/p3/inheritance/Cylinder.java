package week1.Assignment.lab3.p3.inheritance;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;

    }
    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }


    public double computeVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
