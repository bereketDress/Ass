package week1.Assignment.lab3.p3.inheritance;

/**
 * it is fragile inheritance: not "is-a" relationship(A Circle is not a Cylinder)
 * Unnecessary constructor arguments: A Circle needs only a radius
  */

public class Main {
    public static void main(String[] args) {
        Cylinder c= new Cylinder(2,5);
        double vol =c.computeVolume();
        System.out.println(vol);
        Circle cl= new Circle(5);
       double area= cl.computeArea();
        System.out.println(area);
    }
}
