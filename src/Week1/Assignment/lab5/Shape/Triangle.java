package week1.Assignment.Lab5.Shape;

public final class Triangle implements Shape {
    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base=base;
        this.height=height;

    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
@Override
    public double computeArea(){
        return base*height;

    }
}
