package week1.Assignment.lab3.p3.inheritance;

public class Circle extends Cylinder {

    public Circle(double radius) {
        super(0,radius);
    }

    public double computeArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

}
