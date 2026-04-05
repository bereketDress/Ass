package week1.Assignment.Lab5.Shape;

public final class Circle implements Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }
@Override
    public double computeArea(){
        return Math.PI*(radius*radius);
    }
}
