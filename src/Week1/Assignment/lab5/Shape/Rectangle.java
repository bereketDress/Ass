package week1.Assignment.Lab5.Shape;

public final class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
@Override
    public double computeArea(){
        return (width*length)/2;
    }
}
