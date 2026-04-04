package week1.Assignment.mock.Factory;

public class Rectangle {
    private double length, width, diagonal;

    // Private constructor — prevents direct instantiation
    private Rectangle(double length, double width, double diagonal) {
        this.length = length;
        this.width = width;
        this.diagonal = diagonal;
    }

    public double computeArea() {
        return length * width;
    }

    // Static factory methods inside the same class
    public static Rectangle createFromDimensions(double length, double width) {
        double diagonal = Math.sqrt(length * length + width * width);
        return new Rectangle(length, width, diagonal);
    }

    public static Rectangle createFromWidthAndDiagonal(double width, double diagonal) {
        double length = Math.sqrt(diagonal * diagonal - width * width);
        return new Rectangle(length, width, diagonal);
    }

}
